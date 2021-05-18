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
@Table(name="equipamento")
public class Equipamento implements Serializable{
	private static final long serialVersionUID = 5702870824830132281L;

	public Equipamento() {} //constructor padrão
	
	@Id()
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_equipamento;
	
	@Column(name="nome_equipamento")
	private String nomeEquipamento;
	
	
}
