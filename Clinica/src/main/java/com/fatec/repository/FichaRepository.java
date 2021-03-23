package com.fatec.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.fatec.model.Ficha;

public interface FichaRepository extends JpaRepositoryImplementation<Ficha, Long> {

}
