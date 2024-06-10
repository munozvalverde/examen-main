package com.examen.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
@Entity
@Table(name = "carrera_materia")
public class CarreraMateria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity = Carrera.class)
    private Carrera carrera;

    @ManyToOne(targetEntity = Materia.class)
    private Materia materia;

}
