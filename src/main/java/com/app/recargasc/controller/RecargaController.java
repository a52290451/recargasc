package com.app.recargasc.controller;

import com.app.recargasc.Service.OperadorService;
import com.app.recargasc.Service.RecargaService;
import com.app.recargasc.dto.RecargaDTO;
import com.app.recargasc.dto.RecargaSumaDTO;
import com.app.recargasc.entity.Operador;
import com.app.recargasc.entity.Recarga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/recarga")
public class RecargaController {

    @Autowired
    private RecargaService recargaService;


    @GetMapping
    public ResponseEntity<List<RecargaDTO>> getAll() {
        List<RecargaDTO> recargas = recargaService.getRecargas();
        return ResponseEntity.ok(recargas);
    }

    @PostMapping
    public void update(@RequestBody RecargaDTO recargaDTO) {
        recargaService.updateRecarga(recargaDTO);
    }

    @DeleteMapping("/{idRecarga}")
    public void delete(@PathVariable("idRecarga") Long idRecarga){
        recargaService.deleteRecarga(idRecarga);
    }

    @GetMapping("/{idRecarga}")
    public Optional<Recarga> getById(@PathVariable("idRecarga") Long idRecarga){
        return recargaService.getRecarga(idRecarga);
    }

    @GetMapping("/totales")
    public List<RecargaSumaDTO> getTotalOperador(){
        return recargaService.countByOperadorId();
    }
}