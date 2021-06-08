package com.fatec.Clinica.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.Clinica.cryptography.EncriptaDecriptaOTP;
import com.fatec.Clinica.model.Relatorios;
import com.fatec.Clinica.repository.RelatoriosRepository;

@Service
public class RelatoriosService {
	@Autowired
	private RelatoriosRepository repository;
	private EncriptaDecriptaOTP encoder = new EncriptaDecriptaOTP();

	public Relatorios InsertRelatorio(Relatorios relatorio) {
		relatorio = CriptografaRelatorios(relatorio);
		repository.save(relatorio);
		return relatorio;
	}

	public List<Relatorios> buscarRelatoriosToList() {
		List<Relatorios> lista = repository.findAll();
		lista = DescriptografaRelatorios(lista);
		Collections.reverse(lista);
		return lista;
	}

	public String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date).toString();
	}

	public Relatorios CriptografaRelatorios(Relatorios relatorio) {
		relatorio.setDadosCliente(
				encoder.criptografa(relatorio.getDadosCliente(), encoder.genKey(relatorio.getDadosCliente().length())));
		return relatorio;
	}

	public List<Relatorios> DescriptografaRelatorios(List<Relatorios> relatorios) {
		for (Relatorios r : relatorios) {
			r.setDadosCliente(encoder.decriptografa(r.getDadosCliente(), encoder.genKey(r.getDadosCliente().length())));
			String cpf = r.getDadosCliente().substring(r.getDadosCliente().length() - 3);
			int tamanho = r.getDadosCliente().length();
			r.setDadosCliente(r.getDadosCliente().substring(0, tamanho - 3) + " " + cpf);
		}
		return relatorios;
	}
}
