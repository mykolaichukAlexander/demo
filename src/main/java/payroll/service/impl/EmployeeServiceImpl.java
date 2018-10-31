package payroll.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import payroll.entity.Employee;
import payroll.repository.EmployeeRepository;
import payroll.service.EmployeeService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;


    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee newEmployee(Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @Override
    public Employee getOneEmplouee(Long id) {
        return repository.getOne(id);
    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public Employee replaceEmployee(Employee newEmployee, Long id) {
        return null;
    }
}
