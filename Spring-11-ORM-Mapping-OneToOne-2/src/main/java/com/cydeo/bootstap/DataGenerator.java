package com.cydeo.bootstap;

import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.entity.Region;
import com.cydeo.enums.Gender;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {
    EmployeeRepository employeeRepository;
    DepartmentRepository departmentRepository;

    public DataGenerator(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }


    @Override
    public void run(String... args) throws Exception{

        List<Department> departmentList = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee("Ana","M","ana@cydeo.com", LocalDate.of(2006, 04,10),150000, Gender.FEMALE);
        Employee e2 = new Employee("Tom","K","tom@cydeo.com", LocalDate.of(2010, 05,12),250000, Gender.MALE);
        Employee e3 = new Employee("Kim","S","kim@cydeo.com", LocalDate.of(2020, 04,9),150000, Gender.FEMALE);
        Employee e4 = new Employee("Pet","F","pet@cydeo.com", LocalDate.of(2006, 04,10),200000, Gender.FEMALE);
        Employee e5 = new Employee("Sem","O","sem@cydeo.com", LocalDate.of(2006, 04,10),150000, Gender.MALE);

        Department d1 = new Department("Sports", "Outdoors");
        Department d2 = new Department("Tools", "Hardware");
        Department d3 = new Department("Clothing", "Home");
        Department d4 = new Department("IT", "Developer");
        Department d5 = new Department("IT", "Tester");


        Region r1 = new Region("A", "A");
        Region r2 = new Region("B", "B");
        Region r3 = new Region("C", "C");
        Region r4 = new Region("D", "D");
        Region r5 = new Region("E", "E");


        e1.setDepartment(d1);
        e2.setDepartment(d2);
        e3.setDepartment(d3);
        e4.setDepartment(d4);
        e5.setDepartment(d5);

        e1.setRegion(r1);
        e2.setRegion(r2);
        e3.setRegion(r3);
        e4.setRegion(r4);
        e5.setRegion(r5);

        employeeList.addAll(Arrays.asList(e1, e2, e3, e4, e5));
        departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));




    }
}
