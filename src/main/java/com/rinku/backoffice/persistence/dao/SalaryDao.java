package com.rinku.backoffice.persistence.dao;

import com.rinku.backoffice.persistence.model.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SalaryDao extends JpaRepository<Salary, Long> {
    Optional<Salary> findSalaryByRolId_Id(Long rolId);
}
