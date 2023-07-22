package com.rinku.backoffice.services;

import com.rinku.backoffice.persistence.dao.UserDao;
import com.rinku.backoffice.persistence.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao=userDao;
    }

    public List<User> getUsers(String rol){
        if(rol==null){
            return userDao.findAll();
        }else {
            return userDao.findUsersByRolId_Description(rol);
        }
    }

    public ResponseEntity<?> createUser(User user){
        user.setCreatedBy("System");
        user.setCreatedAt(new Date());
        user.setDeleted(false);
        return ResponseEntity.of(Optional.of(userDao.save(user)));
    }

}
