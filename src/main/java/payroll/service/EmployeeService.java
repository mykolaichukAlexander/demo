package payroll.service;

import payroll.entity.Employee;
import payroll.exception.EmployeeNotFoundException;
import payroll.service.dto.EmployeeDTO;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee newEmployee(Employee newEmployee);
    EmployeeDTO getOneEmployee(Long id) throws EmployeeNotFoundException;
    void deleteEmployee(Long id);
    Employee replaceEmployee(Employee newEmployee, Long id);
    EmployeeDTO convertToDto(Employee employee);


}
