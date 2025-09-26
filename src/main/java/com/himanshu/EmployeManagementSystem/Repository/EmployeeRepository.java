package com.himanshu.EmployeManagementSystem.Repository;

import com.himanshu.EmployeManagementSystem.Model.Employee;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
