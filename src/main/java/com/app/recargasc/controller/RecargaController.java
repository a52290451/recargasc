package com.app.recargasc.controller;

import com.app.recargasc.Service.OperadorService;
import com.app.recargasc.Service.RecargaService;
import com.app.recargasc.entity.Operador;
import com.app.recargasc.entity.Recarga;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Recarga> getAll(){
        return recargaService.getRecargas();
    }

    @PostMapping
    public void update(@RequestBody Recarga recarga){
        recargaService.updateRecarga(recarga);
    }

    @DeleteMapping("/{idRecarga}")
    public void delete(@PathVariable("idRecarga") Long idRecarga){
        recargaService.deleteRecarga(idRecarga);
    }

    @GetMapping("/{idRecarga}")
    public Optional<Recarga> getById(@PathVariable("idRecarga") Long idRecarga){
        return recargaService.getRecarga(idRecarga);
    }

    @GetMapping("/{idOperador}")
    public Long getTotalOperador(@PathVariable("idOperador") Long idOperador){
        return recargaService.countByOperadorId(idOperador);
    }
}