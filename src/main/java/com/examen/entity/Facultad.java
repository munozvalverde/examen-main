package com.examen.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
@Entity
@Table(name = "facultad")
public class Facultad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 150)
    private String nombre;

    @OneToMany(targetEntity = Carrera.class, mappedBy = "facultad")
    private List<Carrera> carreras;

    @OneToMany(targetEntity = Modulo.class, mappedBy = "facultad")
    private List<Modulo> modulos;


}
