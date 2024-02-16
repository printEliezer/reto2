package com.Arroyo.repository;

import com.Arroyo.entity.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistritoRepositorio extends JpaRepository<Distrito, Long> {
}
