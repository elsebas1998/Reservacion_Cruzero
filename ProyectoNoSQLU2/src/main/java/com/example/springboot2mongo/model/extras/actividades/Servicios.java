package com.example.springboot2mongo.model.extras.actividades;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Servicios {
    @Id
    private String id;
    private int codServicios;
    private String nombreServicio;
    private int cantidadServicio;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private double precioServicio;
}
