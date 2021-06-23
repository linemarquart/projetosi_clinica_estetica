package com.fatec.Clinica.services;

import java.util.List;
import java.util.Optional;
import java.net.*;
import java.io.*;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.Clinica.cryptography.EncriptaDecriptaOTP;
import com.fatec.Clinica.model.Cliente;
import com.fatec.Clinica.model.Relatorios;
import com.fatec.Clinica.repository.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	private String keyCliente;
	private String keyCpf;
	private String keyEdereco;

	@Autowired
	private ClienteRepository repository;
	private EncriptaDecriptaOTP encoder = new EncriptaDecriptaOTP();

	@Autowired
	private RelatoriosService relatoriosService;

	public Cliente SearchById(Long id) throws ObjectNotFoundException {
		Optional<Cliente> cliente = repository.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado!"));
	}

	public Cliente InsertCliente(Cliente cliente) {
		Relatorios relatorio = new Relatorios();

		String cpf = cliente.getCpf().split("-")[0].substring(cliente.getCpf().split("-")[0].length() - 3);
		String dados = cliente.getNomeCliente().split(" ")[0] + cpf;

		relatorio.setDadosCliente(dados);
		relatorio.setData(relatoriosService.getDate());
		relatorio.setLog("Insert");
		relatoriosService.InsertRelatorio(relatorio);
		cliente = CriptografaCliente(cliente, repository.save(cliente).id_cliente);
		repository.save(cliente);

		return cliente;
	}

	public void Deletar(Long id) throws ObjectNotFoundException {
		Relatorios relatorio = new Relatorios();
		Cliente cliente = SearchById(id);
		cliente = DescriptografaCliente(cliente);

		String cpf = cliente.getCpf().split("-")[0].substring(cliente.getCpf().split("-")[0].length() - 3);
		String dados = cliente.getNomeCliente().split(" ")[0] + cpf;

		relatorio.setDadosCliente(dados);
		relatorio.setData(relatoriosService.getDate());
		relatorio.setLog("Delete");
		relatoriosService.InsertRelatorio(relatorio);
		repository.deleteById(id);
	}

	public Cliente Alterar(Cliente cliente) {
		repository.save(cliente);
		return cliente;
	}

	public List<Cliente> buscarClienteToList() {
		List<Cliente> lista = repository.findAll();
		lista = DescriptografaCliente(lista);
		return lista;
	}

	public Cliente CriptografaCliente(Cliente cliente, Long id_cliente) {
		String keyCliente = encoder.genKey(cliente.getNomeCliente().length());
		String keyCpf = encoder.genKey(cliente.getCpf().length());
		String keyEdereco = encoder.genKey(cliente.getEndereco().length());

		setKey(id_cliente, keyCliente, keyCpf, keyEdereco);

		cliente.setNomeCliente(encoder.criptografa(cliente.getNomeCliente(), keyCliente));
		cliente.setCpf(encoder.criptografa(cliente.getCpf(), keyCpf));
		cliente.setEndereco(encoder.criptografa(cliente.getEndereco(), keyEdereco));
		return cliente;
	}

	public Cliente DescriptografaCliente(Cliente cliente) {
		String key = getKeyToClient(cliente.id_cliente);
		String keyCliente = key.split(" ")[0];
		String keyCpf = key.split(" ")[1];
		String keyEdereco = key.split(" ")[2];

		cliente.setNomeCliente(encoder.decriptografa(cliente.getNomeCliente(), keyCliente));
		cliente.setCpf(encoder.decriptografa(cliente.getCpf(), keyCpf));
		cliente.setEndereco(encoder.decriptografa(cliente.getEndereco(), keyEdereco));
		return cliente;
	}

	public List<Cliente> DescriptografaCliente(List<Cliente> cliente) {
		for (Cliente c : cliente) {
			String key = getKeyToClient(c.id_cliente);
			String keyCliente = key.split(" ")[0];
			String keyCpf = key.split(" ")[1];
			String keyEdereco = key.split(" ")[2];

			c.setNomeCliente(encoder.decriptografa(c.getNomeCliente(), keyCliente));
			c.setCpf(encoder.decriptografa(c.getCpf(), keyCpf));
			c.setEndereco(encoder.decriptografa(c.getEndereco(), keyEdereco));
		}
		return cliente;
	}

	public String getKeyToClient(long id) {
		String key = "";
		try {
			URL url = new URL("http://localhost:8081/keys/buscarKeysToCliente/" + id);

			URLConnection conn = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String inputLine;
			while ((inputLine = br.readLine()) != null) {
				key += (inputLine);
			}
			br.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return key;
	}

	public void setKey(long idCliente, String keyCliente, String keyCpf, String keyEndereco) {

		try {
			URL url = new URL("http://localhost:8081/keys/cadastrar/");

			JSONObject obj = new JSONObject();

			obj.put("idCliente", idCliente);
			obj.put("keyCliente", keyCliente);
			obj.put("keyCpf", keyCpf);
			obj.put("keyEndereco", keyEndereco);

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json; utf-8");
			conn.setRequestProperty("Accept", "application/json");

			try (OutputStream os = conn.getOutputStream()) {
				byte[] input = obj.toString().getBytes("utf-8");
				os.write(input, 0, input.length);
			}

			try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println(response.toString());
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
