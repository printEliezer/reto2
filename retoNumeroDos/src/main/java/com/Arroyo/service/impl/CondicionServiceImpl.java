package com.Arroyo.service.impl;

import com.Arroyo.entity.Condicion;
import com.Arroyo.repository.CondicionRepositorio;
import com.Arroyo.service.CondicionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CondicionServiceImpl implements CondicionService {

    @Autowired
    private CondicionRepositorio condicionRepositorio;
    @Override
    public List<Condicion> findCondicionAll() {
        return condicionRepositorio.findAll();
    }

    @Override
    public Condicion createCondicion(Condicion condicion) {
        return condicionRepositorio.saveAndFlush(condicion);
    }

    @Override
    public Condicion updateCondicion(Condicion condicion) {
        return condicionRepositorio.save(condicion);
    }

    @Override
    public void deleteCondicion(Long id) {
        condicionRepositorio.deleteById(id);
    }

    @Override
    public Optional<Condicion> getCondicion(Long id) {
        return condicionRepositorio.findById(id);
    }
}
