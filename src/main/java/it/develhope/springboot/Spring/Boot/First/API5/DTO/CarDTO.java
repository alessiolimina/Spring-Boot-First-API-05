package it.develhope.springboot.Spring.Boot.First.API5.DTO;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.modelmapper.ModelMapper;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    @NotBlank (message = "Mandatory")
    private String id;
    @NotBlank (message = "Mandatory")
    private String modelName;
    private double price;

}

