package com.examen.persistence;

import com.examen.entity.Docente;

import java.util.List;
import java.util.Optional;

public interface IDocenteDAO {

    List<Docente> findAll();

    Optional<Docente> findById(Long id);

    void save(Docente docente);

    void deleteById(Long id);
}
