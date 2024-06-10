package com.examen.service.implement;

import com.examen.entity.Modulo;
import com.examen.persistence.IModuloDAO;
import com.examen.repository.ModuloRepository;
import com.examen.service.IModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuloServiceImplement implements IModuloService {

    @Autowired
    private IModuloDAO moduloDAO;


    @Override
    public List<Modulo> findAll() {
        return moduloDAO.findAll();
    }

    @Override
    public Optional<Modulo> findById(Long id) {
        return moduloDAO.findById(id);
    }

    @Override
    public void save(Modulo modulo) {
        moduloDAO.save(modulo);
    }

    @Override
    public void deleteById(Long id) {
        moduloDAO.deleteById(id);
    }
}
