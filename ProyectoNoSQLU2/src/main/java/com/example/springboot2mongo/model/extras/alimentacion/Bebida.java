package com.example.springboot2mongo.model.extras.alimentacion;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Bebida {
    @Id
    private String id;
    private int codBebida;
    private String nombreBebida;
    private int cantidadBebida;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private double precioBebida;
}
