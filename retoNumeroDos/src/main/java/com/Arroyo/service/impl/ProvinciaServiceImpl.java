package com.Arroyo.service.impl;

import com.Arroyo.entity.Provincia;
import com.Arroyo.repository.ProvinciaRepositorio;
import com.Arroyo.service.ProvinciaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProvinciaServiceImpl implements ProvinciaService {

    @Autowired
    private ProvinciaRepositorio provinciaRepositorio;
    @Override
    public List<Provincia> findProvinciaAll() {
        return provinciaRepositorio.findAll();
    }

    @Override
    public Provincia createProvincia(Provincia provincia) {
        return provinciaRepositorio.saveAndFlush(provincia);
    }

    @Override
    public Provincia updateProvincia(Provincia provincia) {
        return provinciaRepositorio.save(provincia);
    }

    @Override
    public void deleteProvincia(Long id) {
        provinciaRepositorio.deleteById(id);
    }

    @Override
    public Optional<Provincia> getProvincia(Long id) {
        return provinciaRepositorio.findById(id);
    }
}
