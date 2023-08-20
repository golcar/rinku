package com.rinku.backoffice.controller;

import com.rinku.backoffice.persistence.model.Retention;
import com.rinku.backoffice.services.RetentionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RetentionController {
    private RetentionService retentionService;

    public RetentionController(RetentionService retentionService){
        this.retentionService=retentionService;
    }

    @GetMapping("/retentions")
    public List<Retention> getRetentions(){
        return retentionService.getRetentions();
    }

    @PostMapping("/retentions")
    public ResponseEntity<?> createRetention(@RequestBody Retention retention){
        return retentionService.createRetentions(retention);
    }
}
