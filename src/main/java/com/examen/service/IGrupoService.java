package com.examen.service;

import com.examen.entity.Grupo;

import java.util.List;
import java.util.Optional;

public interface IGrupoService {

    List<Grupo> findAll();

    Optional<Grupo> findById(Long id);

    void save(Grupo grupo);

    void deleteById(Long id);
}
