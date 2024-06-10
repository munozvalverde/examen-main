package com.examen.persistence.implement;

import com.examen.entity.Aula;
import com.examen.entity.Grupo;
import com.examen.persistence.IAulaDAO;
import com.examen.persistence.IGrupoDAO;
import com.examen.repository.AulaRepository;
import com.examen.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GrupoDAOImplement implements IGrupoDAO {

    @Autowired
    private GrupoRepository grupoRepository;


    @Override
    public List<Grupo> findAll() {
        return grupoRepository.findAll();
    }

    @Override
    public Optional<Grupo> findById(Long id) {
        return grupoRepository.findById(id);
    }

    @Override
    public void save(Grupo grupo) {
        grupoRepository.save(grupo);
    }

    @Override
    public void deleteById(Long id) {
        grupoRepository.deleteById(id);
    }
}
