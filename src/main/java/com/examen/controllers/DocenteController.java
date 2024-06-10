package com.examen.controllers;
import com.examen.controllers.dto.AulaDTO;
import com.examen.controllers.dto.DocenteDTO;
import com.examen.entity.Aula;
import com.examen.entity.Docente;
import com.examen.entity.Usuario;
import com.examen.service.IAulaService;
import com.examen.service.IDocenteService;
import com.examen.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/docente")
public class DocenteController {
    @Autowired
    private IDocenteService docenteService;
    private IUsuarioService usuarioService;
    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Docente> docenteOptional = docenteService.findById(id);
        if(docenteOptional.isPresent()){
            Docente docente = docenteOptional.get();
            DocenteDTO docenteDTO = DocenteDTO.builder()
                    .id(docente.getId())
                    .codigo(docente.getCodigo())
//                    .usuario(docente.getUsuario())
//                    .cargaHorarias(docente.getCargaHorarias())
                    .build();
            return ResponseEntity.ok(docenteDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<DocenteDTO> docenteDTOS = docenteService.findAll().
                stream().map(docente -> DocenteDTO.builder()
                        .id(docente.getId())
                        .codigo(docente.getCodigo())
//                        .usuario(docente.getUsuario())
//                        .cargaHorarias(docente.getCargaHorarias())
                        .build()
                ).toList();
        return ResponseEntity.ok(docenteDTOS);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody DocenteDTO docenteDTO) throws URISyntaxException {
        Optional<Usuario> usuarioOptional = usuarioService.findById(docenteDTO.getUsuario().getId());
        Usuario usuario = new Usuario();
        if(usuarioOptional.isPresent()){
            usuario = usuarioOptional.get();
            usuario.setId(usuarioOptional.get().getId());
//            usuario.setNombre(usuarioOptional.get().getNombre());
//            usuario.setDocente(usuarioOptional.get().getDocente());
            usuario.setEmail(usuarioOptional.get().getEmail());
            usuario.setPassword(usuarioOptional.get().getPassword());
//            usuario.setApMaterno(usuarioOptional.get().getApMaterno());
//            usuario.setApPaterno(usuarioOptional.get().getApPaterno());
//            usuario.setAdministrador(usuarioOptional.get().getAdministrador());
            usuarioService.save(usuario);

        }
        docenteService.save(Docente.builder()
                .id(docenteDTO.getId())
                .codigo(docenteDTO.getCodigo())
//                .usuario(usuario)
//                .cargaHorarias(docenteDTO.getCargaHorarias())
                .build());
        return ResponseEntity.created(new URI("/api/docente/save")).build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody DocenteDTO docenteDTO) throws URISyntaxException {
        Optional<Docente> docenteOptional = docenteService.findById(id);
        if(docenteOptional.isPresent()){
            Docente docente = docenteOptional.get();
            docente.setCodigo(docenteDTO.getCodigo());
//            docente.setUsuario(docenteDTO.getUsuario());
//            docente.setCargaHorarias(docenteDTO.getCargaHorarias());
            docente.setId(id);
            docenteService.save(docente);
            return ResponseEntity.ok("Registro actualizado");
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if (id != null && docenteService.findById(id).isPresent()){
            docenteService.deleteById(id);
            return ResponseEntity.ok("Registro eliminado");
        }
        return ResponseEntity.badRequest().build();
    }
}
