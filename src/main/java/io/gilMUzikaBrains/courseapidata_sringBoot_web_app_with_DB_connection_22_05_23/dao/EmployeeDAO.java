package io.gilMUzikaBrains.courseapidata_sringBoot_web_app_with_DB_connection_22_05_23.dao;

import io.gilMUzikaBrains.courseapidata_sringBoot_web_app_with_DB_connection_22_05_23.model.Employee;

import java.util.List;

public interface EmployeeDAO{
    int save(Employee e);
    int update(int id, Employee employeeWithNewData);
    int delete(int id);
    List<Employee> getAll();
    Employee getById(int id);
}
