package com.examen.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
@Builder
@Entity
@Table(name = "carrera")
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false, name = "nombre", length = 100)
    private String nombre;

    @OneToMany(targetEntity = CarreraMateria.class, mappedBy = "carrera")
    private List<CarreraMateria> carreraMaterias;

    @ManyToOne(targetEntity = Facultad.class)
    private Facultad facultad;
    @OneToMany(targetEntity = CargaHoraria.class, mappedBy = "carrera")
    private List<CargaHoraria> cargaHorarias;


}
