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
@Table(name = "materias")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true, nullable=false, length=100, name = "nombre")
    private String nombre;

    @OneToMany(targetEntity = Horario.class, mappedBy = "materia")
    private List<Horario> horarios;
    @OneToMany(targetEntity = CarreraMateria.class, mappedBy = "materia")
    private List<CarreraMateria>carreraMaterias;
    @OneToMany(targetEntity = CargaHoraria.class, mappedBy = "materia")
    private List<CargaHoraria>cargaHorarias;

}
