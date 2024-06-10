package com.examen.service;

import com.examen.entity.Modulo;

import java.util.List;
import java.util.Optional;

public interface IModuloService {

    List<Modulo> findAll();

    Optional<Modulo> findById(Long id);

    void save(Modulo modulo);

    void deleteById(Long id);
}
