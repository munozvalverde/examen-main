package com.examen.controllers.dto;

import lombok.*;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class HorarioDTO {
    private Long id;
    private String dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private MateriaDTO materia;
    private GrupoDTO grupo;
    private AulaDTO aula;

}
