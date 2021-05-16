package com.fatec.Clinica.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.fatec.Clinica.model.Cliente;

public interface FichaRepository extends JpaRepositoryImplementation<Cliente, Long> {

}
