package com.rinku.backoffice.controller;

import com.rinku.backoffice.persistence.model.Rol;
import com.rinku.backoffice.services.RolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RolController {
    private RolService rolService;

    public RolController(RolService rolService){
        this.rolService=rolService;
    }

    @GetMapping("/roles")
    public List<Rol> getRoles(){
        return rolService.getAllRoles();
    }

    @PostMapping("/roles")
    public ResponseEntity<?> createRol(@RequestBody Rol rol){

        return rolService.createRol(rol);
    }

}
