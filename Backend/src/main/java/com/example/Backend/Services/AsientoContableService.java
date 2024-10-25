package com.example.Backend.Services;

import com.example.Backend.Entities.AsientoContable;
import com.example.Backend.Repository.AsientoContableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsientoContableService {

    @Autowired
    private AsientoContableRepository asientoContableRepository;

    public List<AsientoContable> listarAsientosContables() {
        return asientoContableRepository.findAll();
    }
}
