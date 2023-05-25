package com.danuja.my_first_springboot;


import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    // get all
    @GetMapping("/employees")
    List<Employee> all() {
        return repository.findAll();
    }

    // create item
    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    // get a single item
    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {
       return repository.findById(id).orElseThrow(
              () -> new EmployeeNotFoundException(id)
       );
    }

    // update a item
    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
        return repository.findById(id)
                .map(employee -> {
                    if (newEmployee.getName() != null) {
                        employee.setName(newEmployee.getName());
                    }
                    if (newEmployee.getRole() != null) {
                        employee.setRole(newEmployee.getRole());
                    }
                    return repository.save(employee);
                })
                .orElseGet(()-> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    // delete a item
    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable long id) {
         repository.deleteById(id);
    }
}
