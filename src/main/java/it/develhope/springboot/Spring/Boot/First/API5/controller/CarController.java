package it.develhope.springboot.Spring.Boot.First.API5.controller;

import it.develhope.springboot.Spring.Boot.First.API5.DTO.CarDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CarController {
    @GetMapping("/")
    public String getNewCar (@RequestParam (required = true) CarDTO car){return car.toString();
    }
    @PostMapping("/")
    public String postNewCar (@Valid @RequestBody CarDTO car, HttpServletRequest request, HttpServletResponse response){
        return car.toString();
    }
}
//fixme controllare come aggiungere http message 'created', aggiungere json e documentazione Postman