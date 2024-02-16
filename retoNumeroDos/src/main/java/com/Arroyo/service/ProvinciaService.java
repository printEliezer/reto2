package com.Arroyo.service;

import com.Arroyo.entity.Gerente;
import com.Arroyo.entity.Provincia;

import java.util.List;
import java.util.Optional;

public interface ProvinciaService {

    public List<Provincia> findProvinciaAll();
    public Provincia createProvincia(Provincia provincia);
    public Provincia updateProvincia(Provincia provincia);
    public void deleteProvincia(Long id);
    public Optional<Provincia> getProvincia(Long id);
}
