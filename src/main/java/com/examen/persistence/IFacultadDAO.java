package com.examen.persistence;

import com.examen.entity.Facultad;

import java.util.List;
import java.util.Optional;

public interface IFacultadDAO {

    List<Facultad> findAll();

    Optional<Facultad> findById(Long id);

    void save(Facultad facultad);

    void deleteById(Long id);
}
