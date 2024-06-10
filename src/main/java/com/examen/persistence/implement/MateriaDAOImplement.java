package com.examen.persistence.implement;

import com.examen.entity.Aula;
import com.examen.entity.Materia;
import com.examen.persistence.IAulaDAO;
import com.examen.persistence.IMateriaDAO;
import com.examen.repository.AulaRepository;
import com.examen.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MateriaDAOImplement implements IMateriaDAO {

    @Autowired
    private MateriaRepository materiaRepository;


    @Override
    public List<Materia> findAll() {
        return materiaRepository.findAll();
    }

    @Override
    public Optional<Materia> findById(Long id) {
        return materiaRepository.findById(id);
    }

    @Override
    public void save(Materia materia) {
        materiaRepository.save(materia);
    }

    @Override
    public void deleteById(Long id) {
        materiaRepository.deleteById(id);
    }
}
