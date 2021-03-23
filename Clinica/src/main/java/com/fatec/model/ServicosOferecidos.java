package com.fatec.model;

import java.io.Serializable;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="servicos_oferecidos")
public class ServicosOferecidos implements Serializable{
	private static final long serialVersionUID = -1233595710989292078L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_servicos_oferecidos;
	
	@Column(name="nome")
	private String nomeServicos;
	
	@Column(name="valor")
	private float valor;
	
	@OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_profissional", nullable = false)
    private Profissionais Profissional;
	
	@Column(name="tempo")
	private LocalTime tempo;
	
	@OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="equipamento", nullable = false)
    private Equipamento Equipamento;
	
}
