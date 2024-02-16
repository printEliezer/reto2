package com.Arroyo.service.impl;

import com.Arroyo.entity.Hospital;
import com.Arroyo.repository.HospitalRepositorio;
import com.Arroyo.service.HospitalService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepositorio hospitalRepositorio;
    @Override
    public List<Hospital> findHospitalAll() {
        return hospitalRepositorio.findAll();
    }

    @Override
    public Hospital createHospital(Hospital hospital) {
        return hospitalRepositorio.saveAndFlush(hospital);
    }

    @Override
    public Hospital updateHospital(Hospital hospital) {
        return hospitalRepositorio.save(hospital);
    }

    @Override
    public void deleteHospital(Long id) {
        hospitalRepositorio.deleteById(id);
    }

    @Override
    public Optional<Hospital> getHospital(Long id) {
        return hospitalRepositorio.findById(id);
    }
}
