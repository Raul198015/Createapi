package com.Api1.infra.repositories;

import com.Api1.domain.models.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository <Cita, Integer> {
}
