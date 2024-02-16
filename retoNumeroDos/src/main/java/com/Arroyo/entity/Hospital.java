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
public class Hospital {
    @Id
    @Column(name = "IDHOSPITAL")
    private Long idHospitale;
    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "ANTIGUEDAD")
    private Long Antiguedad;

    @Column(name = "AREA")
    private Long Area;

    @Column(name = "IDDISTRITO")
    private Long idDistrito;

    @Column(name = "IDGERENTE")
    private Long IdGerente;

    @Column(name = "IDSEDE")
    private Long IdSede;

    @Column(name = "IDCONDICION")
    private Long IdCondicion;

    @Column(name = "FECHAREGISTRO")
    private Date fechaRegistro;
}
