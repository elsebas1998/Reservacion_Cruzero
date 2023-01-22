package com.example.userservice.model.extras.alimentacion;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Comida {
    @Id
    private String id;
    private int codComida;
    private String nombreComida;
    private int cantidadComida;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private double precioComida;
}
