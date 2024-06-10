package com.examen.service;

import com.examen.entity.Carrera;

import java.util.List;
import java.util.Optional;

public interface ICarreraService {

    List<Carrera> findAll();

    Optional<Carrera> findById(Long id);

    void save(Carrera carrera);

    void deleteById(Long id);
}
