package com.Arroyo.controller;

import com.Arroyo.entity.Distrito;
import com.Arroyo.entity.Hospital;
import com.Arroyo.exception.ModelNotFoundException;
import com.Arroyo.service.HospitalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Hospital>> listar() {
        List<Hospital> hospitals = hospitalService.findHospitalAll();
        return new ResponseEntity<>(hospitals, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Hospital> crearHospital(@Valid @RequestBody Hospital hospital){
        hospitalService.createHospital(hospital);
        return new ResponseEntity<Hospital>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hospital> getHospitalById(@PathVariable("id") Long id){
        Hospital hospital= hospitalService.getHospital(id).orElseThrow(()->new ModelNotFoundException("Distrito no encontrado"));
        return new ResponseEntity<Hospital>(hospital, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Hospital> deleteHospital(@PathVariable("id") Long id){
        hospitalService.deleteHospital(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public Hospital updateHospital(@PathVariable("id") Long id, @Valid @RequestBody Hospital hospital){
        Hospital hospital1 = hospitalService.getHospital(id).orElseThrow(()->new ModelNotFoundException("Distrito no encontrado"));
        hospital1.setNombre(hospital.getNombre());
        hospital1.setAntiguedad(hospital.getAntiguedad());
        hospital1.setArea(hospital.getArea());
        hospital1.setIdSede(hospital.getIdSede());
        hospital1.setIdGerente(hospital.getIdGerente());
        hospital1.setIdCondicion(hospital.getIdCondicion());
        hospital1.setIdDistrito(hospital.getIdDistrito());
        hospital1.setFechaRegistro(hospital.getFechaRegistro());
        return hospitalService.updateHospital(hospital1);

    }
}
