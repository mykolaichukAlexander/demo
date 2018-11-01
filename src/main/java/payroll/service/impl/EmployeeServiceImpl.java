package payroll.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import payroll.entity.Employee;
import payroll.exception.EmployeeNotFoundException;
import payroll.repository.EmployeeRepository;
import payroll.service.EmployeeService;
import payroll.service.dto.EmployeeDTO;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    private final ModelMapper modelMapper;


    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee newEmployee(Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @Override
    public EmployeeDTO getOneEmployee(Long id) throws EmployeeNotFoundException {
        Employee employee = repository.getOne(id);
        return  convertToDto(employee);
    }

    @Override
    public void deleteEmployee(Long id) {

    }

    @Override
    public Employee replaceEmployee(Employee newEmployee, Long id) {
        return null;
    }

    @Override
    public EmployeeDTO convertToDto(Employee employee) {
        return modelMapper.map(employee, EmployeeDTO.class);
    }
}
