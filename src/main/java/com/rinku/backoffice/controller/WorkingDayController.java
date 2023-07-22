package com.rinku.backoffice.controller;

import com.rinku.backoffice.persistence.model.WorkingDay;
import com.rinku.backoffice.services.WorkingDayService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkingDayController {
    private WorkingDayService workingDayService;

    public WorkingDayController(WorkingDayService workingDayService){
        this.workingDayService=workingDayService;
    }

    @GetMapping("/workingdays")
    public List<WorkingDay> getWorkingDays(){
        return workingDayService.getWorkingDays();
    }

    @PostMapping("/workingdays")
    public ResponseEntity<?> createWorkingDay(@RequestBody WorkingDay workingDay){
        return workingDayService.createWorkingDay(workingDay);
    }
}
