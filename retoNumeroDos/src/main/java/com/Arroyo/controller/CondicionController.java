package com.Arroyo.controller;

import com.Arroyo.entity.Condicion;
import com.Arroyo.exception.ModelNotFoundException;
import com.Arroyo.service.CondicionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/condicion")
public class CondicionController {
    @Autowired
    private CondicionService condicionService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Condicion>> listar(){
        List<Condicion> condicions = new ArrayList<>();
        condicions = condicionService.findCondicionAll();
        return new ResponseEntity<List<Condicion>>(condicions, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Condicion> crearCondicion(@Valid @RequestBody Condicion condicion){
        condicionService.createCondicion(condicion);
        return new ResponseEntity<Condicion>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Condicion> getCondicionById(@PathVariable("id") Long id){
        Condicion condicion= condicionService.getCondicion(id).orElseThrow(()-> new ModelNotFoundException("Condicion no encontrado $id"));
        return new ResponseEntity<Condicion>(condicion, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Condicion> deleteCondicion(@PathVariable("id") Long id){
        condicionService.deleteCondicion(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public Condicion updateCondicion(@PathVariable("id") Long id, @Valid @RequestBody Condicion condicion){
        Condicion condicion1 = condicionService.getCondicion(id).orElseThrow(()-> new ModelNotFoundException("Condicion no encontrado"));
            condicion1.setDescCondicion(condicion.getDescCondicion());
            condicion1.setFechaRegistro(condicion.getFechaRegistro());
            return condicionService.updateCondicion(condicion1);
    }
}
