package com.examen.controllers.dto;

import com.examen.entity.Aula;
import com.examen.entity.Facultad;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class ModuloDTO {
    private Long id;
    private String nombre;
    private FacultadDTO facultad;
}
