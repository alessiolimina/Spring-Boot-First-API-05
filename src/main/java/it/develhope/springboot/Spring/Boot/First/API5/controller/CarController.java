package it.develhope.springboot.Spring.Boot.First.API5.controller;

import it.develhope.springboot.Spring.Boot.First.API5.DTO.CarDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CarController {

    @GetMapping("/")
    public CarDTO getNewCar (){
        return new CarDTO();
    }
    @PostMapping("/")
    public ResponseEntity<String> postNewCar (@Valid @RequestBody CarDTO car){
        return ResponseEntity.status(HttpStatus.CREATED).body("Created car " + car.toString());
    }
}

//Documentazione Postman: https://documenter.getpostman.com/view/26121086/2s93XwyimR
