package com.example.Backend.Controllers;

import com.example.Backend.Entities.AsientoContable;
import com.example.Backend.Services.AsientoContableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/asientos")
public class AsientoContableController {

    @Autowired
    private AsientoContableService asientoContableService;

    @GetMapping("/listar")
    public List<AsientoContable> listarAsientos() {
        return asientoContableService.listarAsientosContables();
    }
}

