package com.Arroyo.repository;

import com.Arroyo.entity.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepositorio extends JpaRepository<Sede, Long> {
}
