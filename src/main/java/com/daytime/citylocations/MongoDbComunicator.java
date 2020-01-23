package com.daytime.citylocations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Component
public class MongoDbComunicator {


    private CityRepository repository;

    @Autowired
    public MongoDbComunicator(CityRepository repository) {
        this.repository = repository;
    }

    public List<String> getAllCities(){
        return repository.findAll()
                .stream()
                .map(City::getName)
                .collect(toList());
    }

    public City findCityByName(String name) {
        return repository.findByName(name);
    }

}
