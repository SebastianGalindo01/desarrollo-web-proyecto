package co.edu.poli.Contaminacion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.poli.Contaminacion.model.*;

public interface TownRepository extends MongoRepository<ApiData, String>{



}
