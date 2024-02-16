package com.Arroyo.service.impl;

import com.Arroyo.entity.Distrito;
import com.Arroyo.repository.DistritoRepositorio;
import com.Arroyo.service.DistritoService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DistritoServiceImpl implements DistritoService {

    @Autowired
    private DistritoRepositorio distritoRepositorio;
    @Override
    public List<Distrito> findDistritoAll() {
        return distritoRepositorio.findAll();
    }

    @Override
    public Distrito createDistrito(Distrito distrito) {
        return distritoRepositorio.saveAndFlush(distrito);
    }

    @Override
    public Distrito updateDistrito(Distrito distrito) {
        return distritoRepositorio.save(distrito);
    }

    @Override
    public void deleteDistrito(Long id) {
        distritoRepositorio.deleteById(id);
    }

    @Override
    public Optional<Distrito> getDistrito(Long id) {
        return distritoRepositorio.findById(id);
    }
}
