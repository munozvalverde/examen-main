package com.examen.service;

import com.examen.entity.Horario;

import java.util.List;
import java.util.Optional;

public interface IHorarioService {

    List<Horario> findAll();

    Optional<Horario> findById(Long id);

    void save(Horario horario);

    void deleteById(Long id);
}
