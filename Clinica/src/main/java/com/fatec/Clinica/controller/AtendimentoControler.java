package com.fatec.Clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.Clinica.model.Atendimento;
import com.fatec.Clinica.model.Cliente;
import com.fatec.Clinica.services.AtendimentoService;
import com.fatec.Clinica.services.ClienteService;

import javassist.tools.rmi.ObjectNotFoundException;

@CrossOrigin()
@RestController()
@RequestMapping("/atendimento")
public class AtendimentoControler {
	@Autowired(required = true)
	public AtendimentoService service;
	@Autowired(required = true)
	public ClienteService clienteService;

	@PostMapping("/cadastrar")
	public ResponseEntity<Atendimento> cadastrar(@RequestBody Atendimento atendimento) throws ObjectNotFoundException {
		service.InsertAtendimento(atendimento);
		Cliente cliente = clienteService.SearchById(atendimento.getCliente());
		service.AddAtendimento(cliente, atendimento.getId_atendimento().toString());
		return ResponseEntity.ok(atendimento);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<Void> apagar(@PathVariable Long id) {
		service.Deletar(id);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/editar/{id}")
	public ResponseEntity<Atendimento> alterar(@PathVariable("id") Long id) throws Exception {
		return null;
	}

	@GetMapping("/buscarAtendimentoPorId/{id}")
	public ResponseEntity<Atendimento> buscarAtendimentoPorId(@PathVariable("id") Long id)
			throws ObjectNotFoundException {
		Atendimento cliente = service.SearchById(id);
		return ResponseEntity.ok().body(cliente);
	}
	
	@GetMapping("/buscarAtendimentoPorCliente/{id}")
	public ResponseEntity<List<Atendimento>> buscarAtendimentoPorCliente(@PathVariable("id") Long id)
			throws ObjectNotFoundException {
		List<Atendimento> atendimento = service.buscarAtendimentoToListClient(id);
		return ResponseEntity.ok().body(atendimento);
	}

	@GetMapping("/buscarAtendimentoToList")
	public ResponseEntity<List<Atendimento>> buscarAtendimentoToList() {
		List<Atendimento> atendimento = service.buscarAtendimentoToList();
		return ResponseEntity.ok().body(atendimento);
	}
}
