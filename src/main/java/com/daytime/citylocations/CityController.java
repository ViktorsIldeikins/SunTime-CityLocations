package com.daytime.citylocations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
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
