package com.examen.persistence;

import com.examen.entity.Carrera;

import java.util.List;
import java.util.Optional;

public interface ICarreraDAO {

    List<Carrera> findAll();

    Optional<Carrera> findById(Long id);

    void save(Carrera carrera);

    void deleteById(Long id);
}
