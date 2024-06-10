package com.examen.service;

import com.examen.entity.Docente;

import java.util.List;
import java.util.Optional;

public interface IDocenteService {

    List<Docente> findAll();

    Optional<Docente> findById(Long id);

    void save(Docente docente);

    void deleteById(Long id);
}
