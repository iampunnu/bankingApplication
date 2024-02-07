package net.praveen.banking.services.impl;


import net.praveen.banking.entity.Student;
import net.praveen.banking.services.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;

//@Component
public class RedisOpertionsRunner  {
/*
    @Autowired
    private StudentDao empDao;

    @Override
    public void run(String... args) throws Exception {

        //saving one employee
        empDao.saveEmployee(new Student(500, "Emp0", 2150.0));

        //saving multiple employees
        empDao.saveAllEmployees(
                Map.of( 501, new Student(501, "Emp1", 2396.0),
                        502, new Student(502, "Emp2", 2499.5),
                        503, new Student(503, "Emp4", 2324.75)
                )
        );

        //modifying employee with empId 503
        empDao.updateEmployee(new Student(503, "Emp3", 2325.25));

        //deleting employee with empID 500
        empDao.deleteEmployee(500);

        //retrieving all employees
        empDao.getAllEmployees().forEach((k,v)-> System.out.println(k +" : "+v));

        //retrieving employee with empID 501
        System.out.println("Emp details for 501 : "+empDao.getOneEmployee(501));
    }*/
}