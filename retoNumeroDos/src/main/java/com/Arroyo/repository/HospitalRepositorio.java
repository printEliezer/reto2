package com.Arroyo.repository;

import com.Arroyo.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepositorio extends JpaRepository<Hospital, Long> {
}
