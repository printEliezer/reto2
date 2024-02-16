package com.Arroyo.repository;

import com.Arroyo.entity.Condicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionRepositorio extends JpaRepository<Condicion, Long> {
}
