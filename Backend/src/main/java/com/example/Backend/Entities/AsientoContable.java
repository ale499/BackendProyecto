package com.example.Backend.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AsientoContable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;  // Puede ser "VENTA" o "GASTO"
    private String descripcion;
    private Double monto;
    private LocalDate fecha;

    // Relación con Venta o Gasto (uno u otro, no ambos)
    @ManyToOne
    private Venta venta;

    @ManyToOne
    private Gasto gasto;



}
