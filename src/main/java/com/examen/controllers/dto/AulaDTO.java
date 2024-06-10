package com.examen.controllers.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class AulaDTO {
    private Long id;
    private String numero;
    private ModuloDTO modulo;
}
