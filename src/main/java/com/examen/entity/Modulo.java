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
@Table(name = "modulo")
public class Modulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true, nullable=false, length=3)
    private String nombre;

    @OneToMany(targetEntity = Aula.class, cascade = CascadeType.REMOVE, mappedBy = "modulo")
    private List<Aula> aulas;
    @ManyToOne(targetEntity = Facultad.class)
    private Facultad facultad;

}
