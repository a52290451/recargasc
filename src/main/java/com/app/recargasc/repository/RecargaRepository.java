package com.app.recargasc.repository;

import com.app.recargasc.dto.RecargaSumaDTO;
import com.app.recargasc.entity.Recarga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecargaRepository extends JpaRepository<Recarga, Long> {
    //@Query("SELECT COUNT(*) FROM Recarga r WHERE r.operador.id_operador = :operadorId")
    @Query("SELECT new com.app.recargasc.dto.RecargaSumaDTO(r.operador.id_operador, r.operador.tipo_operador, COUNT(r), SUM(r.monto)) " +
            "FROM Recarga r " +
            "GROUP BY r.operador.id_operador")
    List<RecargaSumaDTO> countByOperadorId();
}
