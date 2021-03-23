package com.fatec.dto;

import com.fatec.model.Ficha;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class FichaDTO {
	private Long id;
	private String nomeCliente;
    private Long cliente;
	private String CPF;
    private Long id_servicos_prestados;
    
    public FichaDTO(Ficha ficha) {
    	this.id = ficha.getId();
    	this.nomeCliente = ficha.getNomeCliente();
    	this.CPF = ficha.getCPF();
    	}
        
    public Ficha ToEntityInsert(FichaDTO fichaDTO) {
    	return new Ficha(null, nomeCliente, null, CPF, null);
        }
    
    public Ficha ToEntityUpdate(Ficha ficha) {
    	ficha.setNomeCliente(this.nomeCliente);
    	ficha.setCPF(this.CPF);
		return ficha;
    }
}
