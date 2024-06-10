package com.examen.persistence.implement;

import com.examen.entity.Aula;
import com.examen.entity.Carrera;
import com.examen.persistence.IAulaDAO;
import com.examen.persistence.ICarreraDAO;
import com.examen.repository.AulaRepository;
import com.examen.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CarreraDAOImplement implements ICarreraDAO {

    @Autowired
    private CarreraRepository carreraRepository;


    @Override
    public List<Carrera> findAll() {
        return carreraRepository.findAll();
    }

    @Override
    public Optional<Carrera> findById(Long id) {
        return carreraRepository.findById(id);
    }

    @Override
    public void save(Carrera carrera) {
        carreraRepository.save(carrera);
    }

    @Override
    public void deleteById(Long id) {
        carreraRepository.deleteById(id);
    }
}
