package com.Arroyo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "GERENTE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gerente {
    @Id
    @Column(name = "IDGERENTE")
    private Long idGerente;
    @Column(name = "DESCGERENTE")
    private String descGerente;
    @Column(name = "FECHAREGISTRO")
    private Date fechaRegistro;
}
