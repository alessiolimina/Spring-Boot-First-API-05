package it.develhope.springboot.Spring.Boot.First.API5.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
@AllArgsConstructor
public class Car {

    private String id;
    private String modelName;
    private double price;

}
