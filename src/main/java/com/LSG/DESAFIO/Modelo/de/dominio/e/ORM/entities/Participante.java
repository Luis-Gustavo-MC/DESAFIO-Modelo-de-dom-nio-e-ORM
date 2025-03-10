package com.LSG.DESAFIO.Modelo.de.dominio.e.ORM.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "tb_participante")
public class Participante {
    @Id
    @Column(name = "participante_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    private Long id;
    @Setter
    private String nome;
    @Setter
    @Column(unique = true)
    private String email;

    @ManyToMany()
    @JoinTable(name = "tb_participante_atividade", joinColumns = @JoinColumn(name = "participante_id"), inverseJoinColumns = @JoinColumn(name = "atividade_id"))
    private Set<Atividade> atividades = new HashSet<>();

}
