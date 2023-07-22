package com.rinku.backoffice.persistence.dao;

import com.rinku.backoffice.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    List<User> findUsersByRolId_Description(String rolDescription);
}
