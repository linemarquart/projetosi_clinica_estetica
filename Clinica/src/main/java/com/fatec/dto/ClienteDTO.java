package com.fatec.dto;

import com.fatec.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ClienteDTO {
    private Long id;
    private Long ficha;
     
    public ClienteDTO(Cliente cliente) {
	this.id = cliente.getId();
	}
    
    public Cliente ToEntityInsert(ClienteDTO clienteDTO) {
	return new Cliente(null,null);
    }

}

