package com.fatec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="cliente")
@Getter @Setter @AllArgsConstructor
public class Cliente implements Serializable{
	
	@Id()
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="ficha", nullable = false)
    private Ficha ficha;
	
	
}

