package com.fatec.Clinica.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor
@Table(name="cliente")
public class Cliente implements Serializable{
	private static final long serialVersionUID = -4602669281285861285L;

	public Cliente() {} //constructor padrão
	
	@Id()
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_cliente;
	
	@Column(name="nome")
	private String nomeCliente;
	
	@Column(name="cpf")
	private String CPF;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="id_atendimento")
    private int atendimento;
	
}
