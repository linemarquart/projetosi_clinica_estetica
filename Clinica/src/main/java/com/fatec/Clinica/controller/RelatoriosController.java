package com.fatec.Clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.Clinica.model.Relatorios;
import com.fatec.Clinica.services.RelatoriosService;

@Controller
@CrossOrigin()
@RestController
@RequestMapping("/relatorios")
public class RelatoriosController {
	
	@Autowired(required= true)
	public RelatoriosService service;
	
	@GetMapping("/buscarRelatoriosToList")
    public ResponseEntity<List<Relatorios>> buscarRelatoriosToList(){
        List<Relatorios> relatorios= service.buscarRelatoriosToList();
        return ResponseEntity.ok().body(relatorios);
    }
}
