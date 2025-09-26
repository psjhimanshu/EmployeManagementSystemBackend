package com.himanshu.EmployeManagementSystem.Controller;

import com.himanshu.EmployeManagementSystem.Model.Employee;
import com.himanshu.EmployeManagementSystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public List<Employee> getAllEmployee(){
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getById(id);
    }

@PostMapping()
    public Employee addEmployee(@RequestBody Employee employee){
return employeeService.save(employee);
    }
@PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee emp){
        emp.setId(id);
        return employeeService.save(emp);
    }

    @DeleteMapping("/{id}")
public void delete(@PathVariable Long id){
        employeeService.delete(id);
    }


}
