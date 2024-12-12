package com.app.recargasc.Service;

import com.app.recargasc.entity.Operador;
import com.app.recargasc.repository.OperadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OperadorService {
    @Autowired
    OperadorRepository operadorRepository;

    public List<Operador> getOperadores(){
        return operadorRepository.findAll();
    }

    public Optional<Operador> getOperador(Long id){
        return operadorRepository.findById(id);
    }

    public Operador updateOperador(Operador operador) {
        return operadorRepository.save(operador);
    }

    public void deleteOperador(Long id){
        operadorRepository.deleteById(id);
    }
}

