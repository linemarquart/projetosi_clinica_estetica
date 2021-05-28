package com.fatec.Clinica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fatec.Clinica.model.ServicosOferecidos;
import com.fatec.Clinica.repository.ServicosOferecidosRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ServicosOferecidosService  {
	@Autowired
	private ServicosOferecidosRepository repository;
	
	public ServicosOferecidos SearchById (Long id) throws ObjectNotFoundException{
		Optional<ServicosOferecidos> atendimento = repository.findById(id);
		return atendimento.orElseThrow(() -> new ObjectNotFoundException("Atendimento não encontrado!"));
	}
	
	public ServicosOferecidos InsertServicosOferecidos (ServicosOferecidos servicosOferecidos){
		repository.save(servicosOferecidos);
		return servicosOferecidos;
	}

	public void Deletar(Long id) {
		repository.deleteById(id);		
	}

	public List<ServicosOferecidos> buscarServicosOferecidosToList() {
		List<ServicosOferecidos> lista  = repository.findAll();
		return lista;
	}
	
}
