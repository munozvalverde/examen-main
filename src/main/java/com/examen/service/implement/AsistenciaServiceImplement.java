package com.examen.service.implement;

import com.examen.entity.Asistencia;
import com.examen.persistence.IAsistenciaDAO;
import com.examen.repository.AsistenciaRepository;
import com.examen.service.IAsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsistenciaServiceImplement implements IAsistenciaService {

    @Autowired
    private IAsistenciaDAO asistenciaDAO;


    @Override
    public List<Asistencia> findAll() {
        return (List<Asistencia>)asistenciaDAO.findAll();
    }

    @Override
    public Optional<Asistencia> findById(Long id) {
        return asistenciaDAO.findById(id);
    }

    @Override
    public void save(Asistencia asistencia) {
        asistenciaDAO.save(asistencia);
    }

    @Override
    public void deleteById(Long id) {
        asistenciaDAO.deleteById(id);
    }
}
