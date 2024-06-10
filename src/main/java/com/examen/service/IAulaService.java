package com.examen.service;
import com.examen.entity.Aula;

import java.util.List;
import java.util.Optional;

public interface IAulaService {

    List<Aula> findAll();

    Optional<Aula> findById(Long id);

    void save(Aula aula);

    void deleteById(Long id);
}
