package com.examen.controllers.dto;

import com.examen.entity.CargaHoraria;
import com.examen.entity.Horario;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class GrupoDTO {
    private Long id;
    private String sigla;
}
