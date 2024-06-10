package com.examen.persistence;

import com.examen.entity.Materia;

import java.util.List;
import java.util.Optional;

public interface IMateriaDAO {

    List<Materia> findAll();

    Optional<Materia> findById(Long id);

    void save(Materia materia);

    void deleteById(Long id);
}
