package com.app.recargasc.repository;

import com.app.recargasc.entity.Recarga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RecargaRepository extends JpaRepository<Recarga, Long> {
    @Query("SELECT COUNT(*) FROM Recarga r WHERE r.id_operador = :operadorId")
    Long countByOperadorId(Long operadorId);
}
