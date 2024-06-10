package com.examen.controllers;

import com.examen.controllers.dto.AdministradorDTO;
import com.examen.entity.Administrador;
import com.examen.service.IAdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin")
public class AdministradorController {
    @Autowired
    private IAdministradorService administradorService;
    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Administrador> administradorOptional = administradorService.findById(id);
        if (administradorOptional.isPresent()){
            Administrador administrador = administradorOptional.get();
            AdministradorDTO administradorDTO = AdministradorDTO.builder()
                    .id(administrador.getId())
//                    .usuario(administrador.getUsuario())
//                    .cargaHorarias(administrador.getCargaHorarias())
                    .build();
            return ResponseEntity.ok(administradorDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<AdministradorDTO> administradorDTOS = administradorService.findAll()
                .stream().map(administrador -> AdministradorDTO.builder()
                        .id(administrador.getId())
//                        .usuario(administrador.getUsuario())
//                        .cargaHorarias(administrador.getCargaHorarias())
                        .build()
                ).toList();
        return ResponseEntity.ok(administradorDTOS);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody AdministradorDTO administradorDTO) throws URISyntaxException {
        administradorService.save(Administrador.builder()
                .id(administradorDTO.getId())
//                .usuario(administradorDTO.getUsuario())
//                .cargaHorarias(administradorDTO.getCargaHorarias())
                .build());
        return ResponseEntity.created(new URI("/api/admin/save")).build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody AdministradorDTO administradorDTO) {
        Optional<Administrador> administradorOptional = administradorService.findById(id);
        if (administradorOptional.isPresent()){
            Administrador administrador = administradorOptional.get();
//            administrador.setUsuario(administradorDTO.getUsuario());
            administradorService.save(administrador);
            return ResponseEntity.ok("Registro actualizado");
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if (id != null && administradorService.findById(id).isPresent()){
            administradorService.deleteById(id);
            return ResponseEntity.ok("Registro eliminado");
        }
        return ResponseEntity.badRequest().build();
    }

}
