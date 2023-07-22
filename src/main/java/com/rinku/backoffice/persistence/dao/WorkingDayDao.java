package com.rinku.backoffice.persistence.dao;

import com.rinku.backoffice.persistence.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WorkingDayDao extends JpaRepository<WorkingDay, Long> {
    Optional<WorkingDay> findWorkingDayByRolId_Id(Long rolId);
}
