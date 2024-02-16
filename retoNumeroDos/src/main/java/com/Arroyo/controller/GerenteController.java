package com.Arroyo.controller;

import com.Arroyo.entity.Gerente;
import com.Arroyo.exception.ModelNotFoundException;
import com.Arroyo.service.GerenteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/gerente")
public class GerenteController {

    @Autowired
    private GerenteService service;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Gerente>> listar(){
        List<Gerente> gerentes = new ArrayList<>();
        gerentes = service.findGerenteAll();
        return new ResponseEntity<List<Gerente>>(gerentes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Gerente> crearGerente(@Valid @RequestBody Gerente gerente){
        service.createGerente(gerente);
        return new ResponseEntity<Gerente>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gerente> getGerenteById(@PathVariable("id") Long id){
        Gerente gerente = service.getGerente(id).orElseThrow(()->new ModelNotFoundException("Gerente no encontrado $id"));
        return new ResponseEntity<Gerente>(gerente, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Gerente> deleteGerente(@PathVariable("id") Long id){
        service.deleteGerente(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public Gerente updateGerente(@PathVariable("id") Long id, @Valid @RequestBody Gerente gerente){
        Gerente gerente1 = service.getGerente(id).orElseThrow(()-> new ModelNotFoundException("Gerente No encontrado"));
            gerente1.setDescGerente(gerente.getDescGerente());
            gerente1.setFechaRegistro(gerente.getFechaRegistro());
            return service.updateGerente(gerente1);
    }


}
