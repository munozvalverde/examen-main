package com.examen.persistence;

import com.examen.entity.Modulo;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Optional;

public interface IModuloDAO {

    List<Modulo> findAll();

    Optional<Modulo> findById(Long id);

    void save(Modulo modulo);

    void deleteById(Long id);
}
