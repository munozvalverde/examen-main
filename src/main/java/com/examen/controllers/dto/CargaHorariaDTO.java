package com.examen.controllers.dto;

import com.examen.entity.*;
import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class CargaHorariaDTO {
    private Long id;
    private Date fecha;
    private Docente docente;
    private Gestion gestion;
    private Administrador administrador;
    private Grupo grupo;
    private Materia materia;
    private Carrera carrera;
}
