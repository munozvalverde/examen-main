package com.examen.persistence.implement;

import com.examen.entity.Aula;
import com.examen.entity.Modulo;
import com.examen.persistence.IAulaDAO;
import com.examen.persistence.IModuloDAO;
import com.examen.repository.AulaRepository;
import com.examen.repository.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ModuloDAOImplement implements IModuloDAO {

    @Autowired
    private ModuloRepository moduloRepository;


    @Override
    public List<Modulo> findAll() {
        return moduloRepository.findAll();
    }

    @Override
    public Optional<Modulo> findById(Long id) {
        return moduloRepository.findById(id);
    }

    @Override
    public void save(Modulo modulo) {
        moduloRepository.save(modulo);
    }

    @Override
    public void deleteById(Long id) {
        moduloRepository.deleteById(id);
    }
}
