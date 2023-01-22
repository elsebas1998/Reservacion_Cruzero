package com.example.springboot2mongo.service.extras;


import com.example.springboot2mongo.model.extras.Actividades;
import com.example.springboot2mongo.repository.extras.ActividadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadesService {
    @Autowired
    private ActividadesRepository actividadesRepository;

    public Actividades createActividades(Actividades actividades) {
        return actividadesRepository.save(actividades);
    }

}
