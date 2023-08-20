package com.rinku.backoffice.persistence.dao;

import com.rinku.backoffice.persistence.model.Compensation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompensationDao extends JpaRepository<Compensation, Integer> {
}
