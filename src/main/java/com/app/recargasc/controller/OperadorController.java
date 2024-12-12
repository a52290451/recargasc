package com.app.recargasc.controller;

import com.app.recargasc.Service.OperadorService;
import com.app.recargasc.entity.Operador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/operador")
public class OperadorController {

    @Autowired
    private OperadorService operadorService;

    @GetMapping
    public List<Operador> getAll(){
        return operadorService.getOperadores();
    }

    @PostMapping
    public void update(@RequestBody Operador operador){
        operadorService.updateOperador(operador);
    }

    @DeleteMapping("/{idOperador}")
    public void delete(@PathVariable("idOperador") Long idOperador){
        operadorService.deleteOperador(idOperador);
    }

    @GetMapping("/{idOperador}")
    public Optional<Operador> getById(@PathVariable("idOperador") Long idOperador){
        return operadorService.getOperador(idOperador);
    }
}