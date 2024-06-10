package com.examen.persistence.implement;

import com.examen.entity.Aula;
import com.examen.entity.Facultad;
import com.examen.persistence.IAulaDAO;
import com.examen.persistence.IFacultadDAO;
import com.examen.repository.AulaRepository;
import com.examen.repository.FacultadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FacultadDAOImplement implements IFacultadDAO {

    @Autowired
    private FacultadRepository facultadRepository;


    @Override
    public List<Facultad> findAll() {
        return facultadRepository.findAll();
    }

    @Override
    public Optional<Facultad> findById(Long id) {
        return facultadRepository.findById(id);
    }

    @Override
    public void save(Facultad facultad) {
        facultadRepository.save(facultad);
    }

    @Override
    public void deleteById(Long id) {
        facultadRepository.deleteById(id);
    }
}
