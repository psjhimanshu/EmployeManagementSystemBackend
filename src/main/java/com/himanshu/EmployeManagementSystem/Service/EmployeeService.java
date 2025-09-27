package com.himanshu.EmployeManagementSystem.Service;

import com.himanshu.EmployeManagementSystem.Model.Employee;
import com.himanshu.EmployeManagementSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
@Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
    public Employee getById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }
    public Employee save(Employee emp){
        return employeeRepository.save(emp);
    }
    public void delete(Long id){
        employeeRepository.deleteById(id);
    }
    public void deleteALl(){
        employeeRepository.deleteAll();
    }


}
