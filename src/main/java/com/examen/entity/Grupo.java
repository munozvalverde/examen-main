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
@Table(name = "grupo")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true, nullable=false, length=2)
    private String sigla;

    @OneToMany(targetEntity = Horario.class, mappedBy = "grupo")
    private List<Horario> horarios;
    @OneToMany(targetEntity = CargaHoraria.class, mappedBy = "grupo")
    private List<CargaHoraria>cargaHorarias;

}
