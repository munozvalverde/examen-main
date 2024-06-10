package com.examen.controllers.dto;

import com.examen.entity.CargaHoraria;
import com.examen.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AdministradorDTO {
    private Long id;
    private Usuario usuario;
}
