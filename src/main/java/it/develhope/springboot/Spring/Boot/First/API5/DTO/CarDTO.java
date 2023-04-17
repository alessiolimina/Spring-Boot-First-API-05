package it.develhope.springboot.Spring.Boot.First.API5.DTO;

import it.develhope.springboot.Spring.Boot.First.API5.entity.Car;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@ToString
public class CarDTO {

    @Autowired
    private Car car;

    public CarDTO(Car car) {
        this.car = car;
    }
}
