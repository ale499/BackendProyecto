package com.example.Backend.Services;

import com.example.Backend.Entities.Gasto;
import com.example.Backend.Repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastoService {
    @Autowired
    private GastoRepository gastoRepository;

    public Gasto registrarGasto(Gasto gasto) {
        return gastoRepository.save(gasto);
    }
}
