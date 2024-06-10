package com.examen.persistence.implement;

import com.examen.entity.Aula;
import com.examen.persistence.IAulaDAO;
import com.examen.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AulaDAOImplement implements IAulaDAO {

    @Autowired
    private AulaRepository aulaRepository;


    @Override
    public List<Aula> findAll() {
        return aulaRepository.findAll();
    }

    @Override
    public Optional<Aula> findById(Long id) {
        return aulaRepository.findById(id);
    }

    @Override
    public void save(Aula aula) {
        aulaRepository.save(aula);
    }

    @Override
    public void deleteById(Long id) {
        aulaRepository.deleteById(id);
    }
}
