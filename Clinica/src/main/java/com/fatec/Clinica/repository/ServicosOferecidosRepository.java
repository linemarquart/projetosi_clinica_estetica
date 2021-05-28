package com.fatec.Clinica.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.fatec.Clinica.model.ServicosOferecidos;

@Repository
public interface ServicosOferecidosRepository extends JpaRepositoryImplementation<ServicosOferecidos, Long>{

}