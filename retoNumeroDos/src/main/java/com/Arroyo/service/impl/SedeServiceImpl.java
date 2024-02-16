package com.Arroyo.service.impl;

import com.Arroyo.entity.Sede;
import com.Arroyo.repository.SedeRepositorio;
import com.Arroyo.service.SedeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SedeServiceImpl implements SedeService {

    @Autowired
    private SedeRepositorio sedeRepositorio;
    @Override
    public List<Sede> findSedeAll() {
        return sedeRepositorio.findAll();
    }

    @Override
    public Sede createSede(Sede sede) {
        return sedeRepositorio.saveAndFlush(sede);
    }

    @Override
    public Sede updateSede(Sede sede) {
        return sedeRepositorio.save(sede);
    }

    @Override
    public void deleteSede(Long id) {
        sedeRepositorio.deleteById(id);
    }

    @Override
    public Optional<Sede> getSede(Long id) {
        return sedeRepositorio.findById(id);
    }
}
