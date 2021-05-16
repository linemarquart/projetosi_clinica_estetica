package com.fatec.Clinica.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.fatec.Clinica.model.Atendimento;

public interface ServicosPrestRepository extends JpaRepositoryImplementation<Atendimento, Long> {

}