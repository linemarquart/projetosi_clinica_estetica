package com.fatec.Clinica.model;

import java.io.Serializable;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties ({"hibernateLazyInitializer", "handler"})
@Entity
@Getter @Setter @AllArgsConstructor
@Table(name="servicos_oferecidos")
public class ServicosOferecidos implements Serializable{
	private static final long serialVersionUID = 8344992230990166895L;
	
	public ServicosOferecidos() {} //constructor padrão
	
	@Id()
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_servicos_oferecidos;
	
	@Column(name="nome")
	private String nomeServicos;
	
	@Column(name="valor")
	private float valor;
	
	@Column(name="id_profissional")
    private int profissional;
	
	@Column(name="tempo")
	private LocalTime tempo;
	
	@Column(name="equipamento")
    private int Equipamento;
	
}
