package com.examen.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
@Entity
@Table(name = "carga_horaria")
public class CargaHoraria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;

    @ManyToOne(targetEntity = Docente.class)
    private Docente docente;
    @ManyToOne(targetEntity = Gestion.class)
    private Gestion gestion;
    @ManyToOne(targetEntity = Administrador.class)
    private Administrador administrador;
    @ManyToOne(targetEntity = Grupo.class)
    private Grupo grupo;
    @ManyToOne(targetEntity = Materia.class)
    private Materia materia;
    @ManyToOne(targetEntity = Carrera.class)
    private Carrera carrera;

}
