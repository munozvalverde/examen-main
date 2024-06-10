package com.examen.service.implement;

import com.examen.entity.Gestion;
import com.examen.persistence.IGestionDAO;
import com.examen.repository.GestionRepository;
import com.examen.service.IGestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GestionServiceImplement implements IGestionService {

    @Autowired
    private IGestionDAO gestionDAO;


    @Override
    public List<Gestion> findAll() {
        return gestionDAO.findAll();
    }

    @Override
    public Optional<Gestion> findById(Long id) {
        return gestionDAO.findById(id);
    }

    @Override
    public void save(Gestion gestion) {
        gestionDAO.save(gestion);
    }

    @Override
    public void deleteById(Long id) {
        gestionDAO.deleteById(id);
    }
}
