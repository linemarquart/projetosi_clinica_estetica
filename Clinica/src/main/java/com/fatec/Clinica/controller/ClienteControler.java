package com.fatec.Clinica.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fatec.Clinica.cryptography.EncriptaDecriptaOTP;
import com.fatec.Clinica.model.Cliente;
import com.fatec.Clinica.services.ClienteService;


@RestController
@CrossOrigin()
@RequestMapping("/cliente")

public class ClienteControler {
	private EncriptaDecriptaOTP encoder = new EncriptaDecriptaOTP();

	@Autowired(required = true)
	public ClienteService service;

	@PostMapping("/cadastrar")
	public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente) throws Exception {
		service.InsertCliente(cliente);
		return ResponseEntity.ok(cliente);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<Void> apagar(@PathVariable Long id) {
		service.Deletar(id);
		return ResponseEntity.ok().build();
	}

	@GetMapping(value = "/editar/{id}")
	public ResponseEntity<Cliente> alterar(final @PathVariable("id") Long id)
			throws Exception {
		Cliente cliente = service.SearchById(id);
		cliente.setNomeCliente("roberto");
		cliente = service.Alterar(cliente);
		return ResponseEntity.ok().body(cliente);
	}

	@GetMapping("/buscarClientePorId/{id}")
	public ResponseEntity<Cliente> buscarClientePorId(@PathVariable("id") Long id) throws Exception {
		Cliente cliente = service.SearchById(id);
		cliente = service.DescriptografaCliente(cliente);
		return ResponseEntity.ok().body(cliente);
	}

	@GetMapping("/buscarClienteToList")
	public ResponseEntity<List<Cliente>> buscarClienteToList() {
		List<Cliente> cliente = service.buscarClienteToList();
		return ResponseEntity.ok().body(cliente);
	}
}
