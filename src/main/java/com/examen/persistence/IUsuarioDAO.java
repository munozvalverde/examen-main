package com.examen.persistence;

import com.examen.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioDAO {

    List<Usuario> findAll();

    Optional<Usuario> findById(Long id);

    void save(Usuario usuario);

    void deleteById(Long id);
}
