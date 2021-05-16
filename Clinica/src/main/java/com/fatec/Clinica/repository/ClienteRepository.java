package com.fatec.Clinica.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.fatec.Clinica.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepositoryImplementation<Cliente, Long>{

}