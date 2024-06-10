package com.examen.repository;

import com.examen.entity.Gestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestionRepository extends JpaRepository<Gestion, Long> {
}
