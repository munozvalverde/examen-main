package com.examen.repository;

import com.examen.entity.CargaHoraria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargaHorariaRepository extends JpaRepository<CargaHoraria, Long> {
}
