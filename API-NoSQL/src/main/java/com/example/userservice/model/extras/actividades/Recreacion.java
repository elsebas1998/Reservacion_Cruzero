package com.example.userservice.model.extras.actividades;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Recreacion {
    @Id
    private String id;
    private int codRecreacion;
    private String nombreRecreacion;
    private int cantidadRecreacion;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private double precioRecreacion;
}
