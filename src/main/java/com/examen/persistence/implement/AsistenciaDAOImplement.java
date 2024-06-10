package com.examen.persistence.implement;

import com.examen.entity.Asistencia;
import com.examen.persistence.IAsistenciaDAO;
import com.examen.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AsistenciaDAOImplement implements IAsistenciaDAO {

    @Autowired
    private AsistenciaRepository asistenciaRepository;


    @Override
    public List<Asistencia> findAll() {
        return (List<Asistencia>)asistenciaRepository.findAll();
    }

    @Override
    public Optional<Asistencia> findById(Long id) {
        return asistenciaRepository.findById(id);
    }

    @Override
    public void save(Asistencia asistencia) {
        asistenciaRepository.save(asistencia);
    }

    @Override
    public void deleteById(Long id) {
        asistenciaRepository.deleteById(id);
    }
}
