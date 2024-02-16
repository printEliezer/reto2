package com.Arroyo.service;

import com.Arroyo.entity.Gerente;
import com.Arroyo.entity.Hospital;

import java.util.List;
import java.util.Optional;

public interface HospitalService {

    public List<Hospital> findHospitalAll();
    public Hospital createHospital(Hospital hospital);
    public Hospital updateHospital(Hospital hospital);
    public void deleteHospital(Long id);
    public Optional<Hospital> getHospital(Long id);
}
