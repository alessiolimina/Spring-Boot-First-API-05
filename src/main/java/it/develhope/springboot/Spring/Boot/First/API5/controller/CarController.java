package it.develhope.springboot.Spring.Boot.First.API5.controller;

import it.develhope.springboot.Spring.Boot.First.API5.DTO.CarDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class CarController {
    @GetMapping("/")
    public String getNewCar (@RequestParam(required = true) Map <String, String> car){
        return car.entrySet().toString();
    }
    @PostMapping("/")
    public String postNewCar (@Valid @RequestBody CarDTO car){
        return car.toString() + " " + HttpStatus.CREATED;
    }
}

//Documentazione Postman: https://documenter.getpostman.com/view/26121086/2s93XwyimR
