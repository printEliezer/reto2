package com.Arroyo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Condicion {
    @Id
    @Column(name = "IDCONDICION")
    private Long idCondicion;
    @Column(name = "DESCCONDICION")
    private String descCondicion;
    @Column(name = "FECHAREGISTRO")
    private Date fechaRegistro;
}
