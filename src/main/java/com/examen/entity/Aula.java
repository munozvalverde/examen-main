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
@Table(name = "aula")
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true, nullable=false, length=3)
    private String numero;

    @ManyToOne(targetEntity = Modulo.class)
    private Modulo modulo;

    @OneToMany(targetEntity = Horario.class,fetch = FetchType.LAZY, mappedBy = "aula")
    private List<Horario> horarios;

}
