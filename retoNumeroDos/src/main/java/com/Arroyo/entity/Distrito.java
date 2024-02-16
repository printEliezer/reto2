package com.Arroyo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DISTRITO")
public class Distrito {
    @Id
    @Column(name = "IDDISTRITO")
    private Long idDistrito;
    @Column(name = "DESCDISTRITO")
    private String descDistrito;
    @Column(name = "FECHAREGISTRO")
    private Date fechaRegistro;
    @Column(name = "IDPROVINCIA")
    private Long idProvincia;
}
