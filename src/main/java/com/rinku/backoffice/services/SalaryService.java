package com.rinku.backoffice.services;

import com.rinku.backoffice.persistence.dao.SalaryDao;
import com.rinku.backoffice.persistence.model.Salary;
import com.rinku.backoffice.utils.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryService {
    private SalaryDao salaryDao;
    public SalaryService(SalaryDao salaryDao){
        this.salaryDao=salaryDao;
    }

    public List<Salary> getSalaries(){
        return salaryDao.findAll();
    }

    public ResponseEntity<?> createSalary(Salary salary){
        Optional<Salary> salaryOpt=salaryDao.findSalaryByRolId_Id(salary.getRolId().getId());
        Optional<Salary> salaryAllOpt=salaryDao.findSalaryByRolId_Id(Constants.ROL_ALL);
        if(salaryOpt.isPresent()||salaryAllOpt.isPresent()){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Ya existe el salario");
        }else {
            return ResponseEntity.of(Optional.of(salaryDao.save(salary)));
        }
    }
}
