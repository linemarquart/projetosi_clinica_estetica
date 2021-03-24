package com.fatec.model;

import java.io.Serializable;
import java.time.LocalDate;

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

@Entity
@Table(name="servicos_prestados")
public class Atendimento implements Serializable{
	private static final long serialVersionUID = -3014077332877053727L;

	@Id()
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_servicos_prestados;
	
	@Column(name="nome_cliente")
	private String nomeCliente;
	
	@OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_cliente", nullable = false)
    private Cliente cliente;
	
	@OneToOne(fetch= FetchType.LAZY)
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="id_servicos_oferecido", nullable = false)
    private Cliente servicosOferecido;
	
	@Column(name="data")
	private LocalDate data;
	
}
