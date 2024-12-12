package com.app.recargasc.Service;

import com.app.recargasc.entity.Recarga;
import com.app.recargasc.repository.RecargaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecargaService {
    @Autowired
    RecargaRepository recargaRepository;

    public List<Recarga> getRecargas(){
        return recargaRepository.findAll();
    }

    public Optional<Recarga> getRecarga(Long id){
        return recargaRepository.findById(id);
    }

    public void updateRecarga(Recarga recarga){
        recargaRepository.save(recarga);
    }

    public void deleteRecarga(Long id){
        recargaRepository.deleteById(id);
    }
}
