package com.daytime.citylocations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("city-locations")
public class CityController {

    private MongoDbComunicator mongoDB;

    @Autowired
    public CityController(MongoDbComunicator mongoDB) {
        this.mongoDB = mongoDB;
    }

    @GetMapping("/cities")
    public List<String> getAllCityNames() {
        return mongoDB.getAllCities();
    }

    @GetMapping("/cities/{cityName}")
    public City getCity(@PathVariable String cityName) {
        return mongoDB.findCityByName(cityName);
    }
}
