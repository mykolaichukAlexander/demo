package payroll.service;

import org.springframework.web.bind.annotation.RequestBody;
import payroll.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee newEmployee(Employee newEmployee);
    Employee getOneEmplouee(Long id);
    void deleteEmployee(Long id);
    Employee replaceEmployee(Employee newEmployee, Long id);


}
