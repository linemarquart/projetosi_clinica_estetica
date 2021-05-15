package com.fatec.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

	@Id()
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="nome_cliente")
	private String nomeCliente;
	
	@OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_cliente", nullable = false)
    private Cliente cliente;
	
	@Column(name="cpf")
	private String CPF;
	
	@OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_servicos_p", nullable = false)
    private Atendimento atendimento;
	
}
