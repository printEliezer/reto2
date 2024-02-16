package com.Arroyo.service.impl;

import com.Arroyo.entity.Gerente;
import com.Arroyo.repository.GerenteRepositorio;
import com.Arroyo.service.GerenteService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class GerenteServiceImpl implements GerenteService {

    @Autowired
    private GerenteRepositorio gerenteRepositorio;

    @Override
    public List<Gerente> findGerenteAll() {
        return gerenteRepositorio.findAll();
    }

    @Override
    public Gerente createGerente(Gerente gerente) {
        return gerenteRepositorio.saveAndFlush(gerente);
    }

    @Override
    public Gerente updateGerente(Gerente gerente) {
        return gerenteRepositorio.save(gerente);
    }

    @Override
    public void deleteGerente(Long id) {
        gerenteRepositorio.deleteById(id);

    }

    @Override
    public Optional<Gerente> getGerente(Long id) {
        return gerenteRepositorio.findById(id);
    }
}
