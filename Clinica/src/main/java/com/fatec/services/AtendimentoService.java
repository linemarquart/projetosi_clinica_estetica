package com.fatec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.model.Atendimento;
import com.fatec.model.Cliente;
import com.fatec.repository.ServicosPrestRepository;

import javassist.tools.rmi.ObjectNotFoundException;


//AtendimentoService antes estava vazia

@Service
public class AtendimentoService  {
	@Autowired
	private ServicosPrestRepository repository;
	//private FichaService fichaService;
	
	public Atendimento SearchById (Long id) throws ObjectNotFoundException{
		Optional<Atendimento> atendimento = repository.findById(id);
		return atendimento.orElseThrow(() -> new ObjectNotFoundException("Atendimento não encontrado!"));
	}
	
	public Atendimento InsertAtendimento (Atendimento atendimento,Cliente cliente , Cliente servicosOferecido){
		atendimento.setCliente(cliente);
		atendimento.setServicosOferecido(servicosOferecido);
		repository.save(atendimento);
		return atendimento;
	}

	public void Deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

	public Atendimento Alterar(Atendimento atendimento) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Atendimento> buscarAtendimentoToList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
