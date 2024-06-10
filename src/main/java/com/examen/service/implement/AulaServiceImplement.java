package com.examen.service.implement;

import com.examen.entity.Aula;
import com.examen.persistence.IAulaDAO;
import com.examen.repository.AulaRepository;
import com.examen.service.IAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaServiceImplement implements IAulaService {

    @Autowired
    private IAulaDAO aulaDAO;


    @Override
    public List<Aula> findAll() {
        return aulaDAO.findAll();
    }

    @Override
    public Optional<Aula> findById(Long id) {
        return aulaDAO.findById(id);
    }

    @Override
    public void save(Aula aula) {
        aulaDAO.save(aula);
    }

    @Override
    public void deleteById(Long id) {
        aulaDAO.deleteById(id);
    }
}
