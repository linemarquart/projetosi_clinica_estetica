package com.fatec.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.fatec.model.ServicosPrestados;

public interface ServicosPrestRepository extends JpaRepositoryImplementation<ServicosPrestados, Long> {

}