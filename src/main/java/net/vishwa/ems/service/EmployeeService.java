package net.vishwa.ems.service;

import net.vishwa.ems.dto.EmployeeDto;
import net.vishwa.ems.entity.Employee;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeID);

}
