package it.develhope.springboot.Spring.Boot.First.API5.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CarDTO {

    @NotBlank(message = "Mandatory")
    private String id;

    @NotBlank(message = "Mandatory")
    private String modelName;

    private double price;
}
