package com.examen.service;

import com.examen.entity.CarreraMateria;

import java.util.List;
import java.util.Optional;

public interface ICarreraMateriaService {

    List<CarreraMateria> findAll();

    Optional<CarreraMateria> findById(Long id);

    void save(CarreraMateria carreraMateria);

    void deleteById(Long id);
}
