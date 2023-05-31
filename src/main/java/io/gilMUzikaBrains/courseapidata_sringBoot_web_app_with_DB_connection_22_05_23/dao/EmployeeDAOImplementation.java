package io.gilMUzikaBrains.courseapidata_sringBoot_web_app_with_DB_connection_22_05_23.dao;

import io.gilMUzikaBrains.courseapidata_sringBoot_web_app_with_DB_connection_22_05_23.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int save(Employee e) {
        String sql = "INSERT INTO tbl_employees (name, email, department) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, new Object[]{e.getName(), e.getEmail(), e.getDepartment()});
    }

    @Override
    public int update(int id, Employee employeeWithNewData) {
        String sql = "UPDATE tbl_employees SET name=?, email=?, department=? WHERE id=?";
        Object[] data = new Object[]{
                employeeWithNewData.getName(),
                employeeWithNewData.getEmail(),
                employeeWithNewData.getDepartment(),
                id
        };
        return jdbcTemplate.update(sql, data);
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM tbl_employees WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public List<Employee> getAll() {
        String sql = "SELECT * FROM tbl_employees";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
    }

    @Override
    public Employee getById(int id) {
        String sql = "SELECT * FROM tbl_employees WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Employee>(Employee.class), id);
    }
}
