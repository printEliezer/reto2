package com.Arroyo.controller;

import com.Arroyo.entity.Provincia;
import com.Arroyo.exception.ModelNotFoundException;
import com.Arroyo.service.ProvinciaService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController {

    @Autowired
    ProvinciaService provinciaService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Provincia>> listar(){
        List<Provincia> provincias = new ArrayList<>();
        provincias = provinciaService.findProvinciaAll();
        return new ResponseEntity<List<Provincia>>(provincias, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Provincia> crearProvincia(@Valid @RequestBody Provincia provincia){
        provinciaService.createProvincia(provincia);
        return new ResponseEntity<Provincia>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Provincia> getProvinciaById(@PathVariable("id") Long id){
        Provincia provincia = provinciaService.getProvincia(id).orElseThrow(()->new ModelNotFoundException("Provincia no encontrada"));
        return new ResponseEntity<Provincia>(provincia, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Provincia> deleteProvincia(@PathVariable("id") Long id){
        provinciaService.deleteProvincia(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/{id}")
    public Provincia updateProvincia(@PathVariable("id") long id, @Valid @RequestBody Provincia provincia){
        Provincia provincia1 = provinciaService.getProvincia(id).orElseThrow(()->new ModelNotFoundException("Provincia no encontrada"));
            provincia1.setDescProvincia(provincia.getDescProvincia());
            provincia1.setFechaRegistro((provincia.getFechaRegistro()));
            return provinciaService.updateProvincia(provincia1);
    }
}
