package net.vishwa.ems.repository;

import net.vishwa.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long > {
}
