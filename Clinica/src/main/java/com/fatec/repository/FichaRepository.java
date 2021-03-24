package com.fatec.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.fatec.model.Cliente;

public interface FichaRepository extends JpaRepositoryImplementation<Cliente, Long> {

}
