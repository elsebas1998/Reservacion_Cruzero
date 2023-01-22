package com.example.springboot2mongo.model.extras;


import com.example.springboot2mongo.model.extras.actividades.Recreacion;
import com.example.springboot2mongo.model.extras.actividades.Servicios;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
public class Actividades {
    @Id
    private String id;
    private int codActividades;
    private List<Recreacion> recreacionList;
    private List<Servicios> serviciosList;
}
