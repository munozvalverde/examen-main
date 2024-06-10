package com.examen.service.implement;

import com.examen.entity.Docente;
import com.examen.persistence.IDocenteDAO;
import com.examen.repository.DocenteRepository;
import com.examen.service.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteServiceImplement implements IDocenteService {

    @Autowired
    private IDocenteDAO docenteDAO;


    @Override
    public List<Docente> findAll() {
        return docenteDAO.findAll();
    }

    @Override
    public Optional<Docente> findById(Long id) {
        return docenteDAO.findById(id);
    }

    @Override
    public void save(Docente docente) {
        docenteDAO.save(docente);
    }

    @Override
    public void deleteById(Long id) {
        docenteDAO.deleteById(id);
    }
}
