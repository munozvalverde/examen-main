package com.examen.controllers.dto;

import com.examen.entity.Carrera;
import com.examen.entity.Materia;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class CarreraMateriaDTO {
    private Long id;
    private CarreraDTO carrera;
    private MateriaDTO materia;
}
