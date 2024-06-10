package com.examen.controllers.dto;

import com.examen.entity.CargaHoraria;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class GestionDTO {
    private Long id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
}
