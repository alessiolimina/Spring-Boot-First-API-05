package it.develhope.springboot.Spring.Boot.First.API5.DTO;

import it.develhope.springboot.Spring.Boot.First.API5.entity.Car;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;
import org.modelmapper.ModelMapper;

@Data
@ToString
public class CarDTO {

    @NotBlank (message = "Mandatory")
    private String id;

    @NotBlank (message = "Mandatory")
    private String modelName;

    private double price;



}

