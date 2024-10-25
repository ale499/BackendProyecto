package com.example.Backend.Controllers;

import com.example.Backend.Entities.Gasto;
import com.example.Backend.Services.GastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/listar")
    public List<Gasto> listarGastos() {
        return gastoService.listarGastos();
    }

}