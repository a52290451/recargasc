package com.app.recargasc.Service;

import com.app.recargasc.entity.Vendedor;
import com.app.recargasc.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendedorService {
    @Autowired
    VendedorRepository vendedorRepository;

    public List<Vendedor> getVendedor(){
        return vendedorRepository.findAll();
    }

    public Optional<Vendedor> getVendedor(Long id){
        return vendedorRepository.findById(id);
    }

    public void updateVendedor(Vendedor vendedor){
        vendedorRepository.save(vendedor);
    }

    public void deleteVendedor(Long id){
        vendedorRepository.deleteById(id);
    }
}