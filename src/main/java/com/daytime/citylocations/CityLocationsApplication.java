package com.daytime.citylocations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static java.util.Arrays.asList;

@SpringBootApplication
public class CityLocationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CityLocationsApplication.class, args);
    }

}
