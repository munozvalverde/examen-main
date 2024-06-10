package com.examen.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
@Entity
@Table
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "dia")
    private String dia;
    @Column(name = "hora_inicio", nullable = false)
    private LocalTime horaInicio;
    @Column(name = "hora_fin", nullable = false)
    private LocalTime horaFin;

    @ManyToOne(targetEntity = Materia.class)
    private Materia materia;
    @ManyToOne(targetEntity = Grupo.class)
    private Grupo grupo;
    @ManyToOne(targetEntity = Aula.class)
    private Aula aula;
    @OneToMany(targetEntity = Asistencia.class, mappedBy = "horario")
    private List<Asistencia> asistencias;

}
