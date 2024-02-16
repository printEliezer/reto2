package com.Arroyo.service;

import com.Arroyo.entity.Condicion;

import java.util.List;
import java.util.Optional;

public interface CondicionService {
    public List<Condicion> findCondicionAll();
    public Condicion createCondicion(Condicion condicion);
    public Condicion updateCondicion(Condicion condicion);
    public void deleteCondicion(Long id);
    public Optional<Condicion> getCondicion(Long id);
}
