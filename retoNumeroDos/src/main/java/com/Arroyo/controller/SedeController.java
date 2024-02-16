package com.Arroyo.controller;

import com.Arroyo.entity.Sede;
import com.Arroyo.exception.ModelNotFoundException;
import com.Arroyo.service.SedeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sedes")
public class SedeController {

    @Autowired
    private SedeService sedeService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Sede>> listar(){
        List<Sede> sedes = new ArrayList<>();
        sedes = sedeService.findSedeAll();
        return new ResponseEntity<List<Sede>>(sedes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Sede> crearSede(@Valid @RequestBody Sede sede){
        sedeService.createSede(sede);
        return new ResponseEntity<Sede>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sede> getSedeById(@PathVariable("id") Long id){
        Sede sede = sedeService.getSede(id).orElseThrow(()-> new ModelNotFoundException("Sede no encontrado"));
        return new ResponseEntity<Sede>(sede, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public  ResponseEntity<Sede> deleteSede(@PathVariable("id") Long id){
        sedeService.deleteSede(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public Sede updateSede(@PathVariable("id") Long id, @Valid @RequestBody Sede sede){
        Sede sede1 = sedeService.getSede(id).orElseThrow(()-> new ModelNotFoundException("Sede no encontrado"));
            sede1.setDescSede(sede.getDescSede());
            sede1.setFechaRegistro(sede.getFechaRegistro());
            return sedeService.updateSede(sede1);
    }
}
