package net.praveen.banking.services;

import net.praveen.banking.entity.Student;

import java.util.Map;

public interface StudentDao {

     void saveEmployee(Student emp);
     Student getOneEmployee(Integer id);
     void updateEmployee(Student emp);
     Map<Integer, Student> getAllEmployees();
     void deleteEmployee(Integer id);
     void saveAllEmployees(Map<Integer, Student> map);

     public void saveValue(String key,String value) ;
     public String getValue(String key);

}
