package com.fatec.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import com.fatec.model.Cliente;
import com.fatec.model.Profissionais;

@Repository
public interface ProfissionaisRepository extends JpaRepositoryImplementation<Profissionais, Long>{

}