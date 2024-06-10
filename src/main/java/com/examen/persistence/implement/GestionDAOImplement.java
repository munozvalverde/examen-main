package com.examen.persistence.implement;

import com.examen.entity.Aula;
import com.examen.entity.Gestion;
import com.examen.persistence.IAulaDAO;
import com.examen.persistence.IGestionDAO;
import com.examen.repository.AulaRepository;
import com.examen.repository.GestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GestionDAOImplement implements IGestionDAO {

    @Autowired
    private GestionRepository gestionRepository;


    @Override
    public List<Gestion> findAll() {
        return gestionRepository.findAll();
    }

    @Override
    public Optional<Gestion> findById(Long id) {
        return gestionRepository.findById(id);
    }

    @Override
    public void save(Gestion gestion) {
        gestionRepository.save(gestion);
    }

    @Override
    public void deleteById(Long id) {
        gestionRepository.deleteById(id);
    }
}
