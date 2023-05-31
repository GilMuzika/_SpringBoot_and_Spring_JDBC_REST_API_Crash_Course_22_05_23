package io.gilMUzikaBrains.courseapidata_sringBoot_web_app_with_DB_connection_22_05_23.controller;

import io.gilMUzikaBrains.courseapidata_sringBoot_web_app_with_DB_connection_22_05_23.dao.EmployeeDAO;
import io.gilMUzikaBrains.courseapidata_sringBoot_web_app_with_DB_connection_22_05_23.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeDAO eDAO;

    @GetMapping
    public List<Employee> getEmployees(){
        return eDAO.getAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return eDAO.getById(id);
    }

    @PostMapping
    public String addEmployee(@RequestBody Employee e) {
        return "Num. of employees that were added to the DB: " + eDAO.save(e);
    }

    @PutMapping("/{id}")
    public String updateEmployee(@RequestBody Employee e, @PathVariable int id) {
        return "Num. of employees that were updated: " + eDAO.update(id, e);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeByd(@PathVariable int id) {
        return "Num. of Employees that were deleted from the DB:" + eDAO.delete(id);
    }
}
