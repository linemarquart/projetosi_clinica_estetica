package com.fatec.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import com.fatec.model.Equipamento;

@Repository
public interface EquipamentoRepository extends JpaRepositoryImplementation<Equipamento, Long>{

}