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
public class Sede {
    @Id
    @Column(name = "IDSEDE")
    private Long idSede;
    @Column(name = "DESCSEDE")
    private String descSede;
    @Column(name = "FECHAREGISTRO")
    private Date fechaRegistro;
}
