package com.fatec.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fatec.dto.FichaDTO;
import com.fatec.model.Ficha;
import com.fatec.repository.FichaRepository;

@Service
public class FichaService {
	@Autowired
	private FichaRepository repository;
	private ClienteService clienteService;
	
	public Optional<Ficha> SearchById (Long id){
		Optional<Ficha> ficha = repository.findById(id);
		return ficha;
	}
	
	public Ficha InsertFicha (FichaDTO fichaDTO){
		Ficha ficha = fichaDTO.ToEntityInsert(fichaDTO);
		ficha.setCliente(fichaDTO.getCliente() != null ? clienteService.SearchById(fichaDTO.getCliente()) : null);
		repository.save(ficha);
		return ficha;
	}

}
