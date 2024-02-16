package com.Arroyo.service;

import com.Arroyo.entity.Gerente;
import com.Arroyo.entity.Sede;

import java.util.List;
import java.util.Optional;

public interface SedeService {

    public List<Sede> findSedeAll();
    public Sede createSede(Sede sede);
    public Sede updateSede(Sede sede);
    public void deleteSede(Long id);
    public Optional<Sede> getSede(Long id);
}
