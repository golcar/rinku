package com.rinku.backoffice.controller;

import com.rinku.backoffice.persistence.model.Salary;
import com.rinku.backoffice.services.SalaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalaryController {
    private SalaryService salaryService;

    public SalaryController(SalaryService salaryService){
        this.salaryService=salaryService;
    }

    @GetMapping("/salaries")
    public List<Salary> getSalaries(){
        return salaryService.getSalaries();
    }

    @PostMapping("/salaries")
    public ResponseEntity<?> createSalary(@RequestBody Salary salary){
        return salaryService.createSalary(salary);
    }
}
