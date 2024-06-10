package com.examen.persistence;

import com.examen.entity.Administrador;

import java.util.List;
import java.util.Optional;

public interface IAdministradorDAO {

    List<Administrador> findAll();

    Optional<Administrador> findById(Long id);

    void save(Administrador administrador);

    void deleteById(Long id);

}
