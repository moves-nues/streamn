package ru.skypro.streamn.model;

import java.util.Objects;

public class Employee {

        private static int counter = 1;
        private String fullName;
        private int department;
        private int salary;
        private int id = counter++;

        public Employee(String fullName, int department, int salary) {
            this.department = department;
            this.fullName = fullName;
            this.salary = salary;
        }

        public String getFullName() {
            return fullName;
        }

        public int getDepartment() {
            return department;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void setDepartment(int department) {
            this.department = department;

        }

        @Override
        public String toString() {
            return "Employee{" +
                    "fullName='" + fullName + '\'' +
                    ", department=" + department +
                    ", salary=" + salary +
                    ", id=" + id +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(fullName, department, salary, id);
        }
    }


