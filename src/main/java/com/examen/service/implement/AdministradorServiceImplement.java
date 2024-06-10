package com.examen.service.implement;

import com.examen.entity.Administrador;
import com.examen.persistence.IAdministradorDAO;
import com.examen.repository.AdministradorRepository;
import com.examen.service.IAdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministradorServiceImplement implements IAdministradorService {

    @Autowired
    private IAdministradorDAO administradorDAO;

    @Override
    public List<Administrador> findAll() {
        return (List<Administrador>) administradorDAO.findAll();
    }

    @Override
    public Optional<Administrador> findById(Long id) {
        return administradorDAO.findById(id);
    }

    @Override
    public void save(Administrador administrador) {
        administradorDAO.save(administrador);
    }

    @Override
    public void deleteById(Long id) {
        administradorDAO.deleteById(id);
    }
}
