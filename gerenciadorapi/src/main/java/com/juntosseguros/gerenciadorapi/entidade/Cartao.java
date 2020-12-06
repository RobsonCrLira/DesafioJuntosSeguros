package com.juntosseguros.gerenciadorapi.entidade;

import lombok.*;
import lombok.experimental.UtilityClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private int id_usuario;

    @Column(nullable = false)
    private LocalDate data_inicio;

    private LocalDate data_fim;
    
}
