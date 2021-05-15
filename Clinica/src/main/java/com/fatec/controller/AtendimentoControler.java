package com.fatec.controller;

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

import com.fatec.model.Atendimento;
import com.fatec.model.Cliente;
import com.fatec.services.AtendimentoService;

import javassist.tools.rmi.ObjectNotFoundException;

@CrossOrigin ()
@RestController()
@RequestMapping("/servicos_prestados")
public class AtendimentoControler {
	@Autowired(required= true)
	public AtendimentoService service;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Atendimento> cadastrar( @RequestBody Atendimento atendimento,
			Cliente cliente, Cliente servicosOferecido) {
        service.InsertAtendimento(atendimento, cliente , servicosOferecido);
        return ResponseEntity.ok(atendimento);
    }
	@DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> apagar( @PathVariable Long id) {
            service.Deletar(id);
        return ResponseEntity.ok().build();
    }
	
	@PutMapping(value = "/editar/{id}")
    public ResponseEntity<Atendimento> alterar(final @PathVariable("id") Long id,
    		@RequestBody Atendimento cliente) throws Exception {
        Atendimento clienteRef = service.Alterar(cliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(clienteRef.getId_servicos_prestados()).toUri();
        return  ResponseEntity.ok().location(uri).build();
    }
	
	@GetMapping("/buscarAtendimentoPorId/{id}")
    public ResponseEntity<Atendimento> buscarAtendimentoPorId(@PathVariable("id") Long id) throws ObjectNotFoundException{
        Atendimento cliente= service.SearchById(id);
        return ResponseEntity.ok().body(cliente);
    }
	@GetMapping("/buscarAtendimentoToList")
    public ResponseEntity<List<Atendimento>> buscarAtendimentoToList(){
        List<Atendimento> cliente= service.buscarAtendimentoToList();
        return ResponseEntity.ok().body(cliente);
    }
}
