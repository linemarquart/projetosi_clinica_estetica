package com.fatec.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.model.Atendimento;
import com.fatec.model.Cliente;
import com.fatec.repository.ClienteRepository;

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
	
	public Cliente InsertCliente (Atendimento atendimento,Cliente cliente){
		cliente.setAtendimento(atendimento);
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
