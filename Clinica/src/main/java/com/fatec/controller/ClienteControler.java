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
import com.fatec.services.ClienteService;

@CrossOrigin()
@RestController
@RequestMapping("/cliente")
public class ClienteControler {
	@Autowired(required= true)
	public ClienteService service;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Cliente> cadastrar( @RequestBody Cliente cliente, Atendimento atendimento) {
        service.InsertCliente(atendimento, cliente);
        return ResponseEntity.ok(cliente);
    }
	@DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> apagar( @PathVariable Long id) {
            service.Deletar(id);
        return ResponseEntity.ok().build();
    }
	
	@PutMapping(value = "/editar/{id}")
    public ResponseEntity<Cliente> alterar(final @PathVariable("id") Long id,
                                                    @RequestBody Cliente cliente) throws Exception {
        Cliente clienteRef = service.Alterar(cliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(clienteRef.getId()).toUri();
        return  ResponseEntity.ok().location(uri).build();
    }
	
	@GetMapping("/buscarClientePorId/{id}")
    public ResponseEntity<Cliente> buscarClientePorId(@PathVariable("id") Long id){
        Cliente cliente= service.SearchById(id);
        return ResponseEntity.ok().body(cliente);
    }
	@GetMapping("/buscarClienteToList")
    public ResponseEntity<List<Cliente>> buscarClienteToList(){
        List<Cliente> cliente= service.buscarClienteToList();
        return ResponseEntity.ok().body(cliente);
    }
}
