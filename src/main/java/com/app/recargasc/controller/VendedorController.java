package com.app.recargasc.controller;

import com.app.recargasc.Service.OperadorService;
import com.app.recargasc.Service.VendedorService;
import com.app.recargasc.entity.Operador;
import com.app.recargasc.entity.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/vendedor")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @GetMapping
    public List<Vendedor> getAll(){
        return vendedorService.getVendedor();
    }

    @PostMapping
    public void update(@RequestBody Vendedor vendedor){
        vendedorService.updateVendedor(vendedor);
    }

    @DeleteMapping("/{idVendedor}")
    public void delete(@PathVariable("idVendedor") Long idVendedor){
        vendedorService.deleteVendedor(idVendedor);
    }

    @GetMapping("/{idVendedor}")
    public Optional<Vendedor> getById(@PathVariable("idVendedor") Long idVendedor){
        return vendedorService.getVendedor(idVendedor);
    }
}
