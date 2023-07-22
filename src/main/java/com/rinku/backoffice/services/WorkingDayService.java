package com.rinku.backoffice.services;

import com.rinku.backoffice.persistence.dao.WorkingDayDao;
import com.rinku.backoffice.persistence.model.WorkingDay;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingDayService {
    private WorkingDayDao workingDayDao;

    public WorkingDayService(WorkingDayDao workingDayDao){
        this.workingDayDao=workingDayDao;
    }

    public List<WorkingDay> getWorkingDays(){
        return workingDayDao.findAll();
    }

    public ResponseEntity<?> createWorkingDay(WorkingDay workingDay){
        Optional<WorkingDay> workingDayOpt=workingDayDao.findWorkingDayByRolId_Id(workingDay.getRolId().getId());
        Optional<WorkingDay> workingDayAllOpt=workingDayDao.findWorkingDayByRolId_Id(0L);
        if(workingDayOpt.isPresent()||workingDayAllOpt.isPresent()){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return ResponseEntity.of(Optional.of(workingDayDao.save(workingDay)));
    }
}
