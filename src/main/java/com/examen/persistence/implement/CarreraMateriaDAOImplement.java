package com.examen.persistence.implement;

import com.examen.entity.Aula;
import com.examen.entity.CarreraMateria;
import com.examen.persistence.IAulaDAO;
import com.examen.persistence.ICarreraMateriaDAO;
import com.examen.repository.AulaRepository;
import com.examen.repository.CarreraMateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CarreraMateriaDAOImplement implements ICarreraMateriaDAO {

    @Autowired
    private CarreraMateriaRepository carreraMateriaRepository;


    @Override
    public List<CarreraMateria> findAll() {
        return carreraMateriaRepository.findAll();
    }

    @Override
    public Optional<CarreraMateria> findById(Long id) {
        return carreraMateriaRepository.findById(id);
    }

    @Override
    public void save(CarreraMateria carreraMateria) {
        carreraMateriaRepository.save(carreraMateria);
    }

    @Override
    public void deleteById(Long id) {
        carreraMateriaRepository.deleteById(id);
    }
}
