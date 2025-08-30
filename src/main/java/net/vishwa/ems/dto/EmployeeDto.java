package net.vishwa.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.PrimitiveIterator;
import java.util.logging.LogManager;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
