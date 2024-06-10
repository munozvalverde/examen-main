package com.examen.persistence.implement;

import com.examen.entity.Aula;
import com.examen.entity.Usuario;
import com.examen.persistence.IAulaDAO;
import com.examen.persistence.IUsuarioDAO;
import com.examen.repository.AulaRepository;
import com.examen.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UsuarioDAOImplement implements IUsuarioDAO {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
