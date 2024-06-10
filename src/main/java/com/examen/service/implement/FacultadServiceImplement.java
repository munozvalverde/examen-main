package com.examen.service.implement;

import com.examen.entity.Facultad;
import com.examen.persistence.IFacultadDAO;
import com.examen.repository.FacultadRepository;
import com.examen.service.IFacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultadServiceImplement implements IFacultadService {

    @Autowired
    private IFacultadDAO facultadDAO;


    @Override
    public List<Facultad> findAll() {
        return facultadDAO.findAll();
    }

    @Override
    public Optional<Facultad> findById(Long id) {
        return facultadDAO.findById(id);
    }

    @Override
    public void save(Facultad facultad) {
        facultadDAO.save(facultad);
    }

    @Override
    public void deleteById(Long id) {
        facultadDAO.deleteById(id);
    }
}
