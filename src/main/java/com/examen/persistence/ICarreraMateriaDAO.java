package com.examen.persistence;

import com.examen.entity.CarreraMateria;

import java.util.List;
import java.util.Optional;

public interface ICarreraMateriaDAO {

    List<CarreraMateria> findAll();

    Optional<CarreraMateria> findById(Long id);

    void save(CarreraMateria carreraMateria);

    void deleteById(Long id);
}
