package it.develhope.springboot.Spring.Boot.First.API5.controller;

import it.develhope.springboot.Spring.Boot.First.API5.DTO.CarDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CarController {
    @GetMapping("/")
    public CarDTO getNewCar (@RequestParam (required = true) CarDTO car){
        return new CarDTO();
    }
    @PostMapping
    public CarDTO postNewCar (@RequestBody CarDTO car, HttpServletRequest request, HttpServletResponse response){
        return car;
    }
}
//fixme aggiungere validation tramite dipendenza, controllare come aggiungere http message 'created'