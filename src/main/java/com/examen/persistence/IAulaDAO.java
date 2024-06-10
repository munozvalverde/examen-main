package com.examen.persistence;
import com.examen.entity.Aula;

import java.util.List;
import java.util.Optional;

public interface IAulaDAO {

    List<Aula> findAll();

    Optional<Aula> findById(Long id);

    void save(Aula aula);

    void deleteById(Long id);
}
