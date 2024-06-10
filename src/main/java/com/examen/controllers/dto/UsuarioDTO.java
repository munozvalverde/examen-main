package com.examen.controllers.dto;

import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
public class UsuarioDTO {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Set<String> roles;
}
