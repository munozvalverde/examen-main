package com.examen.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.TimeZone;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Builder
@Entity
@Table(name = "asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private char estado;
    private Date fecha;
    private TimeZone hora;
    private String observacion;

    @ManyToOne(targetEntity = Horario.class)
    private Horario horario;

}
