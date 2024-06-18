package ru.skypro.streamn.service.impl;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import ru.skypro.streamn.model.Employee;
import ru.skypro.streamn.service.EmployeeService;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Locale.filter;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employees = new HashMap<>();
    @PostConstruct
    public void init(){
        employees.put("employee1", new Employee("employee1", 1, 100000));
        employees.put("employee2", new Employee("employee1", 2, 100000));
        employees.put("employee3", new Employee("employee1", 3, 100000));
        employees.put("employee4", new Employee("employee1", 1, 100000));
        employees.put("employee5", new Employee("employee1", 2, 100000));
        employees.put("employee6", new Employee("employee1", 2, 100000));
    }
    @Override
    public Employee getEmployeeWithMinSalary(int department) {
       return employees.values()
               .stream()
               .filter(employee -> department == employee.getDepartment())
               .min(Comparator.comparing(Employee::getSalary))
               .orElse(null);


    }

    @Override
    public Employee getEmployeeWithMaxSalary(int department) {
        return employees.values()
                .stream()
                .filter(employee -> department == employee.getDepartment())
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
    }

    @Override
    public List<Employee> getAllEmployee(int department) {
        return employees.values()
                .stream()
                .filter(employee -> department == employee.getDepartment())
                .toList();
    }



    @Override
    public Map<Integer, List<Employee>> getAllEmployeeGroupByDepartment() {
        return employees.values()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}

