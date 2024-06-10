package com.examen.service;

import com.examen.entity.Gestion;

import java.util.List;
import java.util.Optional;

public interface IGestionService {

    List<Gestion> findAll();

    Optional<Gestion> findById(Long id);

    void save(Gestion gestion);

    void deleteById(Long id);
}
