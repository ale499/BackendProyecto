package com.example.Backend.Controllers;

import com.example.Backend.Entities.Gasto;
import com.example.Backend.Services.GastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gastos")
public class GastoController {

    @Autowired
    private GastoService gastoService;

    @PostMapping("/registrar")
    public ResponseEntity<Gasto> registrarGasto(@RequestBody Gasto gasto) {
        Gasto nuevoGasto = gastoService.registrarGasto(gasto);
        return new ResponseEntity<>(nuevoGasto, HttpStatus.CREATED);
    }
}