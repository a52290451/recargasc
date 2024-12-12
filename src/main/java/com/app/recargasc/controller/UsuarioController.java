package com.app.recargasc.controller;

import com.app.recargasc.Service.UsuarioService;
import com.app.recargasc.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAll(){
        return usuarioService.getUsuarios();
    }

    @PostMapping
    public void update(@RequestBody Usuario usuario){
        usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public void delete(@PathVariable("idUsuario") Long idUsuario){
        usuarioService.deleteUsuario(idUsuario);
    }

    @GetMapping("/{idUsuario}")
    public Optional<Usuario> getById(@PathVariable("idUsuario") Long idUsuario){
        return usuarioService.getUsuario(idUsuario);
    }
}
