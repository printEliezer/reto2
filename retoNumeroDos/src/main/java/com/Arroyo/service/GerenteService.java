package com.Arroyo.service;

import com.Arroyo.entity.Gerente;

import java.util.List;
import java.util.Optional;

public interface GerenteService {

    public List<Gerente> findGerenteAll();
    public Gerente createGerente(Gerente gerente);
    public Gerente updateGerente(Gerente gerente);
    public void deleteGerente(Long id);
    public Optional<Gerente> getGerente(Long id);
}
