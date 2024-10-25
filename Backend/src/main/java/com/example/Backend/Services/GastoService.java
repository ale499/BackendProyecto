package com.example.Backend.Services;

import com.example.Backend.Entities.AsientoContable;
import com.example.Backend.Entities.Gasto;
import com.example.Backend.Repository.AsientoContableRepository;
import com.example.Backend.Repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoService {
    @Autowired
    private GastoRepository gastoRepository;
    @Autowired
    private AsientoContableRepository asientoContableRepository;


    public Gasto registrarGasto(Gasto nuevoGasto) {
        // Crear asiento contable
        AsientoContable asiento = new AsientoContable();
        asiento.setTipo("GASTO");
        asiento.setDescripcion("Asiento generado para el gasto: " + nuevoGasto.getDescripcion());
        asiento.setMonto(nuevoGasto.getMonto());
        asiento.setFecha(nuevoGasto.getFecha());
        asiento.setGasto(nuevoGasto);

        // Guardar asiento contable
        asientoContableRepository.save(asiento);

        return nuevoGasto;
    }

    // Método para listar todos los gastos
    public List<Gasto> listarGastos() {
        return gastoRepository.findAll();
    }
}

