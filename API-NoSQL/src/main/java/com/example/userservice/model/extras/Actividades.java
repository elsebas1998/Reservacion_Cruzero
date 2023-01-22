package com.example.userservice.model.extras;


import com.example.userservice.model.extras.actividades.Recreacion;
import com.example.userservice.model.extras.actividades.Servicios;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

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
