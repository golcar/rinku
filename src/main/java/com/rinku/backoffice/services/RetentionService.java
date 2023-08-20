package com.rinku.backoffice.services;

import com.rinku.backoffice.persistence.dao.RetentionDao;
import com.rinku.backoffice.persistence.model.Retention;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RetentionService {
    private RetentionDao retentionDao;

    public RetentionService(RetentionDao retentionDao){
        this.retentionDao=retentionDao;
    }

    public List<Retention> getRetentions(){
        return retentionDao.findAll();
    }

    public ResponseEntity<?> createRetentions(Retention retention){
        return ResponseEntity.of(Optional.of(retentionDao.save(retention)));
    }
}
