package com.example.Backend.Services;

import com.example.Backend.Entities.Venta;
import com.example.Backend.Repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public Venta registrarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }
}
