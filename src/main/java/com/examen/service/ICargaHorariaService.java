package com.examen.service;

import com.examen.entity.CargaHoraria;

import java.util.List;
import java.util.Optional;

public interface ICargaHorariaService {

    List<CargaHoraria> findAll();

    Optional<CargaHoraria> findById(Long id);

    void save(CargaHoraria cargaHoraria);

    void deleteById(Long id);
}
