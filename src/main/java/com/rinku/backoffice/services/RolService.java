package com.rinku.backoffice.services;

import com.rinku.backoffice.persistence.dao.RolDao;
import com.rinku.backoffice.persistence.model.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class RolService {

    private RolDao rolDao;

    public RolService(RolDao rolDao){
        this.rolDao=rolDao;
    }

    public List<Rol> getAllRoles(){
        return rolDao.findAll();
    }
    public ResponseEntity<?> createRol(Rol rol){
        rol.setCreatedAt(new Date());
        rol.setDeleted(false);
        rol.setCreatedBy("System");
        return ResponseEntity.of(Optional.of(rolDao.save(rol)));
    }
}
