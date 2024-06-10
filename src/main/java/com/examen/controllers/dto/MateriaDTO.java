package com.examen.controllers.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class MateriaDTO {
    private Long id;
    private String nombre;
}
