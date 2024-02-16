package com.Arroyo.service;

import com.Arroyo.entity.Distrito;
import com.Arroyo.entity.Gerente;

import java.util.List;
import java.util.Optional;

public interface DistritoService {
    public List<Distrito> findDistritoAll();
    public Distrito createDistrito(Distrito distrito);
    public Distrito updateDistrito(Distrito distrito);
    public void deleteDistrito(Long id);
    public Optional<Distrito> getDistrito(Long id);
}
