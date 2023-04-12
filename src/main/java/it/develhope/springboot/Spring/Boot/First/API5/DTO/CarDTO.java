package it.develhope.springboot.Spring.Boot.First.API5.DTO;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CarDTO {
    private String id;
    private String modelName;
    private double price;
}
