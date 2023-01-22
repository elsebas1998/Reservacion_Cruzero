package com.example.springboot2mongo.repository.extras.alimentacion;

import com.example.springboot2mongo.model.extras.alimentacion.Comida;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComidaRepository extends MongoRepository<Comida, String> {
    public Page<Comida> findAll(Pageable pageable);
}
