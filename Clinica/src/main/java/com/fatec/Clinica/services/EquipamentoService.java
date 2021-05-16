package com.fatec.Clinica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.Clinica.model.Equipamento;
import com.fatec.Clinica.repository.EquipamentoRepository;

import javassist.tools.rmi.ObjectNotFoundException;



@Service
public class EquipamentoService  {
	@Autowired
	private EquipamentoRepository repository;
	//private FichaService fichaService;
	
	public Equipamento SearchById (Long id) throws ObjectNotFoundException{
		Optional<Equipamento> equipamento = repository.findById(id);
		return equipamento.orElseThrow(() -> new ObjectNotFoundException("Equipamento não encontrado!"));
	}
	
	public Equipamento InsertEquipamento (Equipamento equipamento){
		repository.save(equipamento);
		return equipamento;
	}

	public void Deletar(Long id) {
		repository.deleteById(id);		
	}

	public Equipamento Alterar(Equipamento equipamento) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Equipamento> buscarEquipamentoToList() {
		List<Equipamento> lista  = repository.findAll();
		return lista;
	}
	
}
