package com.examen.controllers.dto;

import com.examen.entity.Usuario;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class DocenteDTO {
    private Long id;
    private String codigo;
    private Usuario usuario;
}
