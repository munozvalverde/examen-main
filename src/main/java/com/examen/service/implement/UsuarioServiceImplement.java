package com.examen.service.implement;

import com.examen.entity.Usuario;
import com.examen.persistence.IUsuarioDAO;
import com.examen.repository.UsuarioRepository;
import com.examen.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioDAO usuarioDAO;


    @Override
    public List<Usuario> findAll() {
        return usuarioDAO.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioDAO.findById(id);
    }

    @Override
    public void save(Usuario usuario) {
        usuarioDAO.save(usuario);
    }

    @Override
    public void deleteById(Long id) {
        usuarioDAO.deleteById(id);
    }
}
