package com.app.recargasc.repository;

import com.app.recargasc.entity.Recarga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecargaRepository extends JpaRepository<Recarga, Long> {
}
