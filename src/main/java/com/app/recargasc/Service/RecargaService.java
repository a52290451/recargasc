package com.app.recargasc.Service;

import com.app.recargasc.dto.RecargaDTO;
import com.app.recargasc.dto.RecargaSumaDTO;
import com.app.recargasc.entity.Operador;
import com.app.recargasc.entity.Recarga;
import com.app.recargasc.entity.Usuario;
import com.app.recargasc.entity.Vendedor;
import com.app.recargasc.repository.OperadorRepository;
import com.app.recargasc.repository.RecargaRepository;
import com.app.recargasc.repository.UsuarioRepository;
import com.app.recargasc.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecargaService {
    @Autowired
    RecargaRepository recargaRepository;

    @Autowired
    private OperadorRepository operadorRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private VendedorRepository vendedorRepository;

    public List<RecargaDTO> getRecargas() {
        return recargaRepository.findAll().stream().map(recarga -> new RecargaDTO(
                recarga.getId_recarga(),
                recarga.getFecha(),
                recarga.getMonto(),
                recarga.isEstado(),
                recarga.getTelefono(),
                recarga.getOperador().getId_operador(),
                recarga.getUsuario().getCedula(),
                recarga.getVendedor().getId_ven()
        )).toList();
    }

    // Método para contar el número de recargas por operador
    public List<RecargaSumaDTO> countByOperadorId() {
        return recargaRepository.countByOperadorId();
    }

    public Optional<Recarga> getRecarga(Long id){
        return recargaRepository.findById(id);
    }

    public void updateRecarga(RecargaDTO recargaDTO) {
        // Buscar los objetos Operador, Usuario y Vendedor usando los IDs proporcionados
        Operador operador = operadorRepository.findById(recargaDTO.getId_operador()).orElseThrow(() -> new RuntimeException("Operador no encontrado"));
        Usuario usuario = usuarioRepository.findById(recargaDTO.getId_usuario()).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        Vendedor vendedor = vendedorRepository.findById(recargaDTO.getId_ven()).orElseThrow(() -> new RuntimeException("Vendedor no encontrado"));

        Recarga recarga = new Recarga();
        recarga.setFecha(recargaDTO.getFecha());
        recarga.setMonto(recargaDTO.getMonto());
        recarga.setEstado(recargaDTO.isEstado());
        recarga.setTelefono(recargaDTO.getTelefono());
        recarga.setOperador(operador);
        recarga.setUsuario(usuario);
        recarga.setVendedor(vendedor);

        // Guardar la recarga actualizada
        recargaRepository.save(recarga);
    }

    public void deleteRecarga(Long id){
        recargaRepository.deleteById(id);
    }
}
