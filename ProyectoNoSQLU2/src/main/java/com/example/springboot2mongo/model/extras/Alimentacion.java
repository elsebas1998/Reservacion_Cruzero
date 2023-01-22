package com.example.springboot2mongo.model.extras;

import com.example.springboot2mongo.model.extras.alimentacion.Bebida;
import com.example.springboot2mongo.model.extras.alimentacion.Comida;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Embedded;
import java.util.List;

@Data
@AllArgsConstructor
public class Alimentacion {
    @Id
    private String id;
    private int codAlimentacion;
    @Embedded
    private List<Bebida> bebidaList;
    @Embedded
    private List<Comida> comidaList;
}
