package com.fatec.Clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.Clinica.model.ServicosOferecidos;
import com.fatec.Clinica.services.ServicosOferecidosService;

import javassist.tools.rmi.ObjectNotFoundException;

@Controller
@CrossOrigin()
@RestController
@RequestMapping("/servicos_oferecidos")
public class ServicosOferecidosController {
	
	@Autowired(required= true)
	public ServicosOferecidosService service;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<ServicosOferecidos> cadastrar(@RequestBody ServicosOferecidos servicosOferecidos) {
        System.out.println(servicosOferecidos);
		service.InsertServicosOferecidos(servicosOferecidos);
        return ResponseEntity.ok(servicosOferecidos);
    }
	@DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> apagar( @PathVariable Long id) {
            service.Deletar(id);
        return ResponseEntity.ok().build();
    }
	
	@GetMapping("/buscarServicosPorId/{id}")
    public ResponseEntity<ServicosOferecidos> buscarServicosOferecidosPorId(@PathVariable("id") Long id) throws ObjectNotFoundException{
		ServicosOferecidos servicosOferecidos = service.SearchById(id);
        return ResponseEntity.ok().body(servicosOferecidos);
    }
	@GetMapping("/buscarServicosToList")
    public ResponseEntity<List<ServicosOferecidos>> buscarServicosOferecidosToList(){
        List<ServicosOferecidos> servicosOferecidos= service.buscarServicosOferecidosToList();
        return ResponseEntity.ok().body(servicosOferecidos);
    }
}
