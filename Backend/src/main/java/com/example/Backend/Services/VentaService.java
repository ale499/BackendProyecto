package com.example.Backend.Services;

import com.example.Backend.Entities.AsientoContable;
import com.example.Backend.Entities.Venta;
import com.example.Backend.Repository.AsientoContableRepository;
import com.example.Backend.Repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;


    @Autowired
    private AsientoContableRepository asientoContableRepository;

    public Venta registrarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    // Método para listar todas las ventas
    public List<Venta> listarVentas() {
        return ventaRepository.findAll();
    }

    // Crear asiento contable
    public AsientoContable crearAsientoContable(Venta nuevaVenta) {
        AsientoContable asiento = new AsientoContable();
        asiento.setTipo("VENTA");
        asiento.setDescripcion("Asiento generado para la venta: " + nuevaVenta.getDescripcion());
        asiento.setMonto(nuevaVenta.getMonto());
        asiento.setFecha(nuevaVenta.getFecha());
        asiento.setVenta(nuevaVenta);

        // Guardar asiento contable
        asientoContableRepository.save(asiento);

        return asiento;
    }
}

