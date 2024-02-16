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
public class Provincia {
    @Id
    @Column(name = "IDPROVINCIA")
    private Long idProvincia;
    @Column(name = "DESCPROVINCIA")
    private String descProvincia;
    @Column(name = "FECHAREGISTRO")
    private Date fechaRegistro;
}
