package com.rinku.backoffice.persistence.dao;

import com.rinku.backoffice.persistence.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolDao extends JpaRepository<Rol, Integer> {
}
