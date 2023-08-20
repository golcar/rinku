package com.rinku.backoffice.persistence.dao;

import com.rinku.backoffice.persistence.model.Compensation;
import com.rinku.backoffice.persistence.model.Retention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetentionDao extends JpaRepository<Retention, Long> {
}
