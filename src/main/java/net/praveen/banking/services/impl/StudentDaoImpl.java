package net.praveen.banking.services.impl;

import jakarta.annotation.Resource;
import net.praveen.banking.entity.Student;
import net.praveen.banking.services.StudentDao;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao {
    private final String hashReference= "Student";

    @Resource(name="redisTemplate")          // 'redisTemplate' is defined as a Bean in AppConfig.java
    private HashOperations<String, Integer, Student> hashOperations;
    @Resource(name = "redisTemplate1")
    private ValueOperations<String,String> redisTemplate1;


    @Override
    public void saveEmployee(Student emp) {
        //creates one record in Redis DB if record with that Id is not present
        hashOperations.putIfAbsent(hashReference, emp.getStdId(), emp);
    }
    @Override
    public void saveValue(String key,String value) {
        //creates one record in Redis DB if record with that Id is not present
        redisTemplate1.set(key,value);
    }
    @Override
    public String getValue(String key) {
        //creates one record in Redis DB if record with that Id is not present
       return redisTemplate1.get(key);
    }


    @Override
    public Student getOneEmployee(Integer id) {
        return hashOperations.get(hashReference, id);
    }
    @Override
    public void saveAllEmployees(Map<Integer, Student> map) {
        hashOperations.putAll(hashReference, map);
    }

    @Override
    public void updateEmployee(Student emp) {
        hashOperations.put(hashReference, emp.getStdId(), emp);
    }

    @Override
    public Map<Integer, Student> getAllEmployees() {
        return hashOperations.entries(hashReference);
    }

    @Override
    public void deleteEmployee(Integer id) {
        hashOperations.delete(hashReference, id);
    }
}
