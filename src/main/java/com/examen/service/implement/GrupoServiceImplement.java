package com.examen.service.implement;

import com.examen.entity.Grupo;
import com.examen.persistence.IGrupoDAO;
import com.examen.repository.GrupoRepository;
import com.examen.service.IGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoServiceImplement implements IGrupoService {

    @Autowired
    private IGrupoDAO grupoDAO;


    @Override
    public List<Grupo> findAll() {
        return grupoDAO.findAll();
    }

    @Override
    public Optional<Grupo> findById(Long id) {
        return grupoDAO.findById(id);
    }

    @Override
    public void save(Grupo grupo) {
        grupoDAO.save(grupo);
    }

    @Override
    public void deleteById(Long id) {
        grupoDAO.deleteById(id);
    }
}
