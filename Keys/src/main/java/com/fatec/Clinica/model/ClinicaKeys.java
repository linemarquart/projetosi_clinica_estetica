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
@Table(name = "clinica_keys")
public class ClinicaKeys implements Serializable {
	private static final long serialVersionUID = -4602669281285861285L;

	public ClinicaKeys() {
	} // constructor padrão

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id_key;

	@Column(name = "id_cliente")
	public long idCliente;

	@Column(name = "key_cliente")
	public String keyCliente;
	
	@Column(name = "key_cpf")
	public String keyCpf;
	
	@Column(name = "key_endereco")
	public String keyEndereco;

}
