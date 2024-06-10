package com.examen.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "admins")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//
//    @OneToOne(targetEntity = Usuario.class)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private Usuario usuario;
//    @OneToMany(targetEntity = CargaHoraria.class, mappedBy = "administrador")
//    private List<CargaHoraria>cargaHorarias;

}
