package com.example.car_park.service;

import com.example.car_park.entity.Employee;
import com.example.car_park.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpli implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee employee) {

        return employeeRepository.save(employee);
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }
    @Override
    public Employee findById(int id)
    {
        return employeeRepository.findById(id).orElse(null);
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


}
