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

import com.fatec.Clinica.model.Profissionais;
import com.fatec.Clinica.services.ProfissionaisService;

import javassist.tools.rmi.ObjectNotFoundException;

@Controller
@CrossOrigin()
@RestController
@RequestMapping("/profissionais")
public class ProfissionaisControler {
	@Autowired(required= true)
	public ProfissionaisService service;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Profissionais> cadastrar( @RequestBody Profissionais profissionais) {
        service.InsertProfissionais( profissionais);
        return ResponseEntity.ok(profissionais);
    }
	@DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> apagar( @PathVariable Long id) {
            service.Deletar(id);
        return ResponseEntity.ok().build();
    }
	
	@PutMapping(value = "/editar/{id}")
    public ResponseEntity<Profissionais> alterar(final @PathVariable("id") Long id,
                                                    @RequestBody Profissionais profissionais) throws Exception {
        Profissionais profissionaisRef = service.Alterar(profissionais);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(profissionaisRef.getId_profissional()).toUri();
        return  ResponseEntity.ok().location(uri).build();
    }
	
	@GetMapping("/buscarProfissionaisPorId/{id}")
    public ResponseEntity<Profissionais> buscarProfissionaisPorId(@PathVariable("id") Long id) throws ObjectNotFoundException{
        Profissionais profissionais= service.SearchById(id);
        return ResponseEntity.ok().body(profissionais);
    }
	@GetMapping("/buscarProfissionaisToList")
    public ResponseEntity<List<Profissionais>> buscarProfissionaisToList(){
        List<Profissionais> profissionais= service.buscarProfissionaisToList();
        return ResponseEntity.ok().body(profissionais);
    }
}
