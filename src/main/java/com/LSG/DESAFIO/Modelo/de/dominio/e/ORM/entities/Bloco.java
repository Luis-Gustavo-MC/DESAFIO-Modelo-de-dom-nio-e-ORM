package com.LSG.DESAFIO.Modelo.de.dominio.e.ORM.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "tb_bloco")
public class Bloco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private LocalDateTime inicio;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private LocalDateTime fim;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public Bloco(){}

    public Bloco(Long id,Atividade atividade, LocalDateTime inicio, LocalDateTime fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.atividade = atividade;
    }

}
