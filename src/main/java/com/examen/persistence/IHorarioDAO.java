package com.examen.persistence;

import com.examen.entity.Horario;

import java.util.List;
import java.util.Optional;

public interface IHorarioDAO {

    List<Horario> findAll();

    Optional<Horario> findById(Long id);

    void save(Horario horario);

    void deleteById(Long id);
}
