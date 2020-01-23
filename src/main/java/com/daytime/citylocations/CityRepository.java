package com.daytime.citylocations;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CityRepository extends MongoRepository<City, String> {

    City findByName(String name);

}
