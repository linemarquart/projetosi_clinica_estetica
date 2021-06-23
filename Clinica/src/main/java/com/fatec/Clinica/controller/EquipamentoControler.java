package com.fatec.Clinica.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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

import com.fatec.Clinica.model.Equipamento;
import com.fatec.Clinica.services.EquipamentoService;

import javassist.tools.rmi.ObjectNotFoundException;

@Controller
@CrossOrigin()
@RestController
@RequestMapping("/equipamento")
public class EquipamentoControler {
	@Autowired(required= true)
	public EquipamentoService service;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Equipamento> cadastrar( @RequestBody Equipamento equipamento) {
        service.InsertEquipamento( equipamento);
        return ResponseEntity.ok(equipamento);
    }
	@DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> apagar( @PathVariable Long id) {
            service.Deletar(id);
        return ResponseEntity.ok().build();
    }
	
	@PutMapping(value = "/editar/{id}")
    public ResponseEntity<Equipamento> alterar(final @PathVariable("id") Long id,
                                                    @RequestBody Equipamento equipamento) throws Exception {
        Equipamento equipamentoRef = service.Alterar(equipamento);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(equipamentoRef.getId_equipamento()).toUri();
        return  ResponseEntity.ok().location(uri).build();
    }
	
	@GetMapping("/buscarEquipamentoPorId/{id}")
    public ResponseEntity<Equipamento> buscarEquipamentoPorId(@PathVariable("id") Long id) throws ObjectNotFoundException{
        Equipamento equipamento= service.SearchById(id);
        return ResponseEntity.ok().body(equipamento);
    }
	@GetMapping("/buscarEquipamentoToList")
    public ResponseEntity<List<Equipamento>> buscarEquipamentoToList(){
        List<Equipamento> equipamento= service.buscarEquipamentoToList();
        return ResponseEntity.ok().body(equipamento);
    }
}
