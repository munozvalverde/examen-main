package com.examen.repository;

import com.examen.entity.CarreraMateria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraMateriaRepository extends JpaRepository<CarreraMateria, Long> {
}
