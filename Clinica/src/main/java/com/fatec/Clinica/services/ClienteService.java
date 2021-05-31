package com.fatec.Clinica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fatec.Clinica.cryptography.EncriptaDecriptaOTP;
import com.fatec.Clinica.model.Cliente;
import com.fatec.Clinica.repository.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repository;
	private EncriptaDecriptaOTP encoder = new EncriptaDecriptaOTP();
	// private FichaService fichaService;

	public Cliente SearchById(Long id) throws ObjectNotFoundException {
		Optional<Cliente> cliente = repository.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado!"));
	}

	public Cliente InsertCliente(Cliente cliente) {
		cliente = CriptografaCliente(cliente);
		repository.save(cliente);
		return cliente;
	}

	public void Deletar(Long id) {
		repository.deleteById(id);
	}

	public Cliente Alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> buscarClienteToList() {
		List<Cliente> lista = repository.findAll();
		lista = DescriptografaCliente(lista);
		return lista;
	}

	public Cliente CriptografaCliente(Cliente cliente) {
		cliente.setNomeCliente(
				encoder.criptografa(cliente.getNomeCliente(), encoder.genKey(cliente.getNomeCliente().length())));
		cliente.setCpf(encoder.criptografa(cliente.getCpf(), encoder.genKey(cliente.getCpf().length())));
		cliente.setEndereco(encoder.criptografa(cliente.getEndereco(), encoder.genKey(cliente.getEndereco().length())));
		return cliente;
	}

	public Cliente DescriptografaCliente(Cliente cliente) {
		cliente.setNomeCliente(
				encoder.decriptografa(cliente.getNomeCliente(), encoder.genKey(cliente.getNomeCliente().length())));
		cliente.setCpf(encoder.decriptografa(cliente.getCpf(), encoder.genKey(cliente.getCpf().length())));
		cliente.setEndereco(
				encoder.decriptografa(cliente.getEndereco(), encoder.genKey(cliente.getEndereco().length())));
		return cliente;
	}

	public List<Cliente> DescriptografaCliente(List<Cliente> cliente) {
		for (Cliente c : cliente) {
			c.setNomeCliente(encoder.decriptografa(c.getNomeCliente(), encoder.genKey(c.getNomeCliente().length())));
			c.setCpf(encoder.decriptografa(c.getCpf(), encoder.genKey(c.getCpf().length())));
			c.setEndereco(encoder.decriptografa(c.getEndereco(), encoder.genKey(c.getEndereco().length())));
		}
		return cliente;
	}
}
