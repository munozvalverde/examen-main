package com.examen.persistence.implement;

import com.examen.entity.Administrador;
import com.examen.persistence.IAdministradorDAO;
import com.examen.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AdministradorDAOImplement implements IAdministradorDAO {

    @Autowired
    private AdministradorRepository administradorRepository;

    @Override
    public List<Administrador> findAll() {
        return (List<Administrador>) administradorRepository.findAll();
    }

    @Override
    public Optional<Administrador> findById(Long id) {
        return administradorRepository.findById(id);
    }

    @Override
    public void save(Administrador administrador) {
        administradorRepository.save(administrador);
    }

    @Override
    public void deleteById(Long id) {
        administradorRepository.deleteById(id);
    }
}
