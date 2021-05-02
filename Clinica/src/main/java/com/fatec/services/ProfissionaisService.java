package com.fatec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.model.Atendimento;
import com.fatec.model.Profissionais;
import com.fatec.repository.ProfissionaisRepository;

import javassist.tools.rmi.ObjectNotFoundException;



@Service
public class ProfissionaisService  {
	@Autowired
	private ProfissionaisRepository repository;
	//private FichaService fichaService;
	
	public Profissionais SearchById (Long id) throws ObjectNotFoundException{
		Optional<Profissionais> profissionais = repository.findById(id);
		return profissionais.orElseThrow(() -> new ObjectNotFoundException("Profissionais não encontrado!"));
	}
	
	public Profissionais InsertProfissionais (Profissionais profissionais){
		//profissionais.setAtendimento(atendimento);
		repository.save(profissionais);
		return profissionais;
	}

	public void Deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

	public Profissionais Alterar(Profissionais profissionais) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Profissionais> buscarProfissionaisToList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}