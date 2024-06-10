package com.examen.service.implement;

import com.examen.entity.Materia;
import com.examen.persistence.IMateriaDAO;
import com.examen.repository.MateriaRepository;
import com.examen.service.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaServiceImplement implements IMateriaService {

    @Autowired
    private IMateriaDAO materiaDAO;


    @Override
    public List<Materia> findAll() {
        return materiaDAO.findAll();
    }

    @Override
    public Optional<Materia> findById(Long id) {
        return materiaDAO.findById(id);
    }

    @Override
    public void save(Materia materia) {
        materiaDAO.save(materia);
    }

    @Override
    public void deleteById(Long id) {
        materiaDAO.deleteById(id);
    }
}
