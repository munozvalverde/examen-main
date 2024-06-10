package com.examen.controllers;

import com.examen.controllers.dto.AulaDTO;
import com.examen.controllers.dto.CargaHorariaDTO;
import com.examen.entity.Aula;
import com.examen.entity.CargaHoraria;
import com.examen.service.ICargaHorariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cargahoraria")
public class CargaHorariaController {
    @Autowired
    private ICargaHorariaService cargaHorariaService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<CargaHoraria> cargaHorariaOptional = cargaHorariaService.findById(id);
        if(cargaHorariaOptional.isPresent()){
            CargaHoraria cargaHoraria = cargaHorariaOptional.get();
            CargaHorariaDTO cargaHorariaDTO = CargaHorariaDTO.builder()
                    .id(cargaHoraria.getId())
                    .grupo(cargaHoraria.getGrupo())
                    .fecha(cargaHoraria.getFecha())
                    .materia(cargaHoraria.getMateria())
                    .gestion(cargaHoraria.getGestion())
                    .carrera(cargaHoraria.getCarrera())
                    .docente(cargaHoraria.getDocente())
                    .administrador(cargaHoraria.getAdministrador())
                    .build();
            return ResponseEntity.ok(cargaHorariaDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<CargaHorariaDTO> cargaHorariaDTOS = cargaHorariaService.findAll().
                stream().map(cargaHoraria -> CargaHorariaDTO.builder()
                        .id(cargaHoraria.getId())
                        .grupo(cargaHoraria.getGrupo())
                        .fecha(cargaHoraria.getFecha())
                        .materia(cargaHoraria.getMateria())
                        .gestion(cargaHoraria.getGestion())
                        .carrera(cargaHoraria.getCarrera())
                        .docente(cargaHoraria.getDocente())
                        .administrador(cargaHoraria.getAdministrador())
                        .build()
                ).toList();
        return ResponseEntity.ok(cargaHorariaDTOS);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody CargaHorariaDTO cargaHorariaDTO) throws URISyntaxException {
        cargaHorariaService.save(CargaHoraria.builder()
                .id(cargaHorariaDTO.getId())
                .grupo(cargaHorariaDTO.getGrupo())
                .fecha(cargaHorariaDTO.getFecha())
                .materia(cargaHorariaDTO.getMateria())
                .gestion(cargaHorariaDTO.getGestion())
                .carrera(cargaHorariaDTO.getCarrera())
                .docente(cargaHorariaDTO.getDocente())
                .administrador(cargaHorariaDTO.getAdministrador())
                .build());
        return ResponseEntity.created(new URI("/api/cargahoraria/save")).build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody CargaHorariaDTO cargaHorariaDTO) throws URISyntaxException {
        Optional<CargaHoraria> cargaHorariaOptional = cargaHorariaService.findById(id);
        if(cargaHorariaOptional.isPresent()){
            CargaHoraria cargaHoraria = cargaHorariaOptional.get();
            cargaHoraria.setId(id);
            cargaHoraria.setGrupo(cargaHorariaDTO.getGrupo());
            cargaHoraria.setAdministrador(cargaHorariaDTO.getAdministrador());
            cargaHoraria.setFecha(cargaHorariaDTO.getFecha());
            cargaHoraria.setMateria(cargaHorariaDTO.getMateria());
            cargaHoraria.setGestion(cargaHorariaDTO.getGestion());
            cargaHoraria.setCarrera(cargaHorariaDTO.getCarrera());
            cargaHoraria.setDocente(cargaHorariaDTO.getDocente());
            cargaHorariaService.save(cargaHoraria);
            return ResponseEntity.ok("Registro actualizado");
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if (id != null && cargaHorariaService.findById(id).isPresent()){
            cargaHorariaService.deleteById(id);
            return ResponseEntity.ok("Registro eliminado");
        }
        return ResponseEntity.badRequest().build();
    }
}
