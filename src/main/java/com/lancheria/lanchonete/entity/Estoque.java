package com.lancheria.lanchonete.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Estoque")

public class Estoque {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estoque;

    @Column(name = "nomeProduto")
    private String nomeProduto;
    
    @Column(name = "quantidade")
    @JsonIgnore
    private Long quantidade;

    @Column(name = "valor")
    private Double valor;
}
