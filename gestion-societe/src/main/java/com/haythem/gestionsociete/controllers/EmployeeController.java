package com.haythem.gestionsociete.controllers;

import com.haythem.gestionsociete.domain.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private static final String FIRST_NAME = "Haythem";
    private static final String LAST_NAME = "Stiti";

    @RequestMapping("/employee")
    public Employee getEmployee(@RequestParam(value="firstname", defaultValue=FIRST_NAME)  String firstName,
                                @RequestParam(value="lastname", defaultValue=LAST_NAME)  String lastName) {
        return new Employee(firstName,lastName);

    }
}
