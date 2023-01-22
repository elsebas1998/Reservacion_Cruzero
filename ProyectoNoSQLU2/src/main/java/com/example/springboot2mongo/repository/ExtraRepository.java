package com.example.springboot2mongo.repository;

import com.example.springboot2mongo.model.Extras;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraRepository extends MongoRepository<Extras, String> {

}
