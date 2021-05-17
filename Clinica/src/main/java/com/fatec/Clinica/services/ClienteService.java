package com.fatec.Clinica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.Clinica.model.Atendimento;
import com.fatec.Clinica.model.Cliente;
import com.fatec.Clinica.repository.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;



@Service
public class ClienteService  {
	@Autowired
	private ClienteRepository repository;
	//private FichaService fichaService;
	
	public Cliente SearchById (Long id) throws ObjectNotFoundException{
		Optional<Cliente> cliente = repository.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado!"));
	}
	
	public Cliente InsertCliente (Cliente cliente){
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
		List<Cliente> lista  = repository.findAll();
		return lista;
	}
	
}
