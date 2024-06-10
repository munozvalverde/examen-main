package com.examen.service.implement;

import com.examen.entity.Carrera;
import com.examen.persistence.ICarreraDAO;
import com.examen.repository.CarreraRepository;
import com.examen.service.ICarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarreraServiceImplement implements ICarreraService {

    @Autowired
    private ICarreraDAO carreraDAO;


    @Override
    public List<Carrera> findAll() {
        return carreraDAO.findAll();
    }

    @Override
    public Optional<Carrera> findById(Long id) {
        return carreraDAO.findById(id);
    }

    @Override
    public void save(Carrera carrera) {
        carreraDAO.save(carrera);
    }

    @Override
    public void deleteById(Long id) {
        carreraDAO.deleteById(id);
    }
}
