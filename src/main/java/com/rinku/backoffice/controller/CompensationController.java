package com.rinku.backoffice.controller;

import com.rinku.backoffice.persistence.model.Compensation;
import com.rinku.backoffice.services.CompensationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompensationController {
    private CompensationService compensationService;

    public CompensationController(CompensationService compensationService){
        this.compensationService=compensationService;
    }

    @GetMapping("/compensations")
    public List<Compensation> getCompensations(){
        return compensationService.getCompensations();
    }

    @PostMapping("/compensations")
    public ResponseEntity<?> createCompensations(@RequestBody Compensation compensation){
        return compensationService.createCompensation(compensation);
    }
}
