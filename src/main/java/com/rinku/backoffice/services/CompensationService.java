package com.rinku.backoffice.services;

import com.rinku.backoffice.persistence.dao.CompensationDao;
import com.rinku.backoffice.persistence.model.Compensation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompensationService {
    private CompensationDao compensationDao;

    public CompensationService(CompensationDao compensationDao){
        this.compensationDao=compensationDao;
    }

    public List<Compensation> getCompensations(){
        return compensationDao.findAll();
    }

    public ResponseEntity<?> createCompensation(Compensation compensation){
        return ResponseEntity.of(Optional.of(compensationDao.save(compensation)));
    }


}
