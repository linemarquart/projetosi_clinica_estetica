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
@Getter
@Setter
@AllArgsConstructor
@Table(name = "relatorios")
public class Relatorios implements Serializable {
	private static final long serialVersionUID = -4602669281285861285L;

	public Relatorios() {
	} // constructor padrão

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id_relatorio;

	@Column(name = "log")
	public String log;

	@Column(name = "data")
	public String data;

	@Column(name = "dados_cliente")
	public String dadosCliente;
}
