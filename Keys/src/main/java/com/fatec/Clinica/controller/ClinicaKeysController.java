package com.fatec.Clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fatec.Clinica.model.ClinicaKeys;
import com.fatec.Clinica.services.KeysService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController()
@RequestMapping("/keys")
public class ClinicaKeysController {
	@Autowired
	private KeysService service;
	
	@PostMapping("/cadastrar")
	public void cadastrar(@RequestBody ClinicaKeys keys) throws ObjectNotFoundException {
		
		service.InsertKey(keys);
	}

	@DeleteMapping("/excluir/{id}")
	public ResponseEntity<Void> apagar(@PathVariable Long id) throws ObjectNotFoundException {
		service.Deletar(id);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/buscarKeysToCliente/{idCliente}")
	public ResponseEntity<String> buscarKeyToCliente (@PathVariable Long idCliente) {
		String key = service.buscarKeysToCliente(idCliente);
		return ResponseEntity.ok().body(key);
	}
	
	@GetMapping("/buscarKeysToList")
	public ResponseEntity<List<ClinicaKeys>> buscarKeyToList() {
		List<ClinicaKeys> keys = service.buscarKeysToList();
		return ResponseEntity.ok().body(keys);
	}
}
