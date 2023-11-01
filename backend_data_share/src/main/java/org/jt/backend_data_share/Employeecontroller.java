package org.jt.backend_data_share;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.jt.backend_data_share.Employee;

/**
 * Employeecontroller
 */
@Controller
public class Employeecontroller {
    @GetMapping
    public String getEmployees(Model mo) {
        var employee1 = new Employee("Ankit", "Mohanty", "ankit@gmail");
        var employee2 = new Employee("Abhi", "Padhi", "abhi@gmail");
        var employee3 = new Employee("Ram", "Mohan", "ram@gmail");
        var employees = List.of(employee1, employee2, employee3);
        mo.addAttribute("employees", employees);
        return "home";
    }

}