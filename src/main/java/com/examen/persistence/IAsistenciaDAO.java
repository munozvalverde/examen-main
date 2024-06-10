package com.examen.persistence;
import com.examen.entity.Asistencia;

import java.util.List;
import java.util.Optional;

public interface IAsistenciaDAO {

    List<Asistencia> findAll();

    Optional<Asistencia> findById(Long id);

    void save(Asistencia asistencia);

    void deleteById(Long id);
}
