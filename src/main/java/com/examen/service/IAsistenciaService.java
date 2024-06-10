package com.examen.service;
import com.examen.entity.Asistencia;

import java.util.List;
import java.util.Optional;

public interface IAsistenciaService {

    List<Asistencia> findAll();

    Optional<Asistencia> findById(Long id);

    void save(Asistencia asistencia);

    void deleteById(Long id);
}
