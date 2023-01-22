package com.example.userservice.model.extras;

import com.example.userservice.model.extras.alimentacion.Bebida;
import com.example.userservice.model.extras.alimentacion.Comida;
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
