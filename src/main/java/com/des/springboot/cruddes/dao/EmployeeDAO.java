package com.des.springboot.cruddes.dao;

import com.des.springboot.cruddes.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
}
