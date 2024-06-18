package ru.skypro.streamn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.streamn.model.Employee;
import ru.skypro.streamn.service.EmployeeService;

import java.util.List;
import java.util.Map;

@RestController
    @RequestMapping(value = "/employees")
    public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("min-salary")
    public Employee getEmployeeWithMinSalary(int departmentId) {
        return employeeService.getEmployeeWithMinSalary(departmentId);

    }
    @GetMapping("max-salary")
   public Employee getEmployeeWithMaxSalary(int departmentId) {
       return employeeService.getEmployeeWithMaxSalary(departmentId);

    }


    @GetMapping("all-group")
    public Map<Integer, List<Employee>> getAllEmployeeGroupByDepartment() {
        return employeeService.getAllEmployeeGroupByDepartment();

    }
    @GetMapping("all")
    public List<Employee> getAllEmployee(int departmentId) {
        return employeeService.getAllEmployee(departmentId);

    }











}
