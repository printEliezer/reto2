package com.Arroyo.repository;

import com.Arroyo.entity.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenteRepositorio extends JpaRepository<Gerente, Long> {
}
