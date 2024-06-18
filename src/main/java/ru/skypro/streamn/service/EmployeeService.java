package ru.skypro.streamn.service;

import ru.skypro.streamn.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Employee getEmployeeWithMinSalary(int department);
    Employee getEmployeeWithMaxSalary(int department);

    List<Employee> getAllEmployee(int department);

    Map<Integer, List<Employee>> getAllEmployeeGroupByDepartment();
}
