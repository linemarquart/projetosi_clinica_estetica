package com.fatec.Clinica.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor
@Table(name="atendimento")
public class Atendimento implements Serializable{
	private static final long serialVersionUID = -3014077332877053727L;
	
	public Atendimento() {} //constructor padrão

	@Id()
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_atendimento;
	
	@Column(name="id_equipamento")
	private int equipamento;
	
	@Column(name="valor")
	private float valor;
	
	@Column(name="id_cliente")
    private long cliente;
	
	@Column(name="id_servicos_oferecidos")
    private int servicosOferecido;
	
	@Column(name="id_profissional")
    private int profissional;
	
	@Column(name="data")
	private String data;
	
}
