package com.examen.service.implement;

import com.examen.entity.CarreraMateria;
import com.examen.persistence.ICarreraMateriaDAO;
import com.examen.repository.CarreraMateriaRepository;
import com.examen.service.ICarreraMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarreraMateriaServiceImplement implements ICarreraMateriaService {

    @Autowired
    private ICarreraMateriaDAO carreraMateriaDAO;


    @Override
    public List<CarreraMateria> findAll() {
        return carreraMateriaDAO.findAll();
    }

    @Override
    public Optional<CarreraMateria> findById(Long id) {
        return carreraMateriaDAO.findById(id);
    }

    @Override
    public void save(CarreraMateria carreraMateria) {
        carreraMateriaDAO.save(carreraMateria);
    }

    @Override
    public void deleteById(Long id) {
        carreraMateriaDAO.deleteById(id);
    }
}
