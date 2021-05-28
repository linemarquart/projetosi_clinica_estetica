package com.fatec.Clinica.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.Clinica.model.Atendimento;
import com.fatec.Clinica.model.Cliente;
import com.fatec.Clinica.repository.AtendimentoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class AtendimentoService  {
	@Autowired
	private AtendimentoRepository repository;
	//private FichaService fichaService;
	
	public Atendimento SearchById (Long id) throws ObjectNotFoundException{
		Optional<Atendimento> atendimento = repository.findById(id);
		return atendimento.orElseThrow(() -> new ObjectNotFoundException("Atendimento não encontrado!"));
	}
	
	public Atendimento InsertAtendimento (Atendimento atendimento){
		repository.save(atendimento);
		return atendimento;
	}

	public void Deletar(Long id) {
		repository.deleteById(id);		
	}

	public Atendimento Alterar(Atendimento atendimento) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Atendimento> buscarAtendimentoToList() {
		List<Atendimento> lista  = repository.findAll();
		return lista;
	}
	
}
