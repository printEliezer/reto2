package com.Arroyo.controller;

import com.Arroyo.entity.Distrito;
import com.Arroyo.exception.ModelNotFoundException;
import com.Arroyo.service.DistritoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/distritos")
public class DistritoController {

    @Autowired
    private DistritoService distritoService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Distrito>> listar() {
        List<Distrito> distritos = distritoService.findDistritoAll();
        return new ResponseEntity<>(distritos, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Distrito> crearDistrito(@Valid @RequestBody Distrito distrito){
        distritoService.createDistrito(distrito);
        return new ResponseEntity<Distrito>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Distrito> getDistritoById(@PathVariable("id") Long id){
        Distrito distrito= distritoService.getDistrito(id).orElseThrow(()->new ModelNotFoundException("Distrito no encontrado"));
        return new ResponseEntity<Distrito>(distrito, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Distrito> deleteDistrito(@PathVariable("id") Long id){
        distritoService.deleteDistrito(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public Distrito updateDistrito(@PathVariable("id") Long id, @Valid @RequestBody Distrito distrito){
        Distrito distrito1 = distritoService.getDistrito(id).orElseThrow(()->new ModelNotFoundException("Distrito no encontrado"));
        distrito1.setDescDistrito(distrito.getDescDistrito());
        distrito1.setFechaRegistro(distrito.getFechaRegistro());
        distrito1.setIdProvincia(distrito.getIdProvincia());
        return distritoService.updateDistrito(distrito1);

    }
}
