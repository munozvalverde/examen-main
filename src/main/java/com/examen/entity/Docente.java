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
@Table(name = "docente")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 5,unique = true)
    private String codigo;
//
//    @OneToOne(targetEntity = Usuario.class)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private Usuario usuario;
//    @OneToMany(targetEntity = CargaHoraria.class, mappedBy = "docente")
//    private List<CargaHoraria> cargaHorarias;


}
