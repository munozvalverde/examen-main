package com.examen.controllers.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
@Builder

public class CarreraDTO {
    private Long id;
    private String nombre;
    private FacultadDTO facultad;
}
