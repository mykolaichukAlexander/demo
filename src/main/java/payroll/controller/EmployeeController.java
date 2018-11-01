package payroll.controller;


import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import payroll.entity.Employee;
import payroll.exception.EmployeeNotFoundException;
import payroll.service.EmployeeService;
import payroll.service.dto.EmployeeDTO;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class EmployeeController {


    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAll(){return employeeService.getAllEmployees();}

    @GetMapping("/employees/{id}")
    public EmployeeDTO getOne(@PathVariable Long id) throws EmployeeNotFoundException {return employeeService.getOneEmployee(id);}

    @PostMapping("/employees")
    public Employee addOne(@RequestBody Employee employee){return employeeService.newEmployee(employee);}

    @DeleteMapping("/emloyees/{id}")
    public void deleteOne(@PathVariable Long id){employeeService.deleteEmployee(id);}
}

