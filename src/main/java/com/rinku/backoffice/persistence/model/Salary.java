package com.rinku.backoffice.persistence.model;

import com.rinku.backoffice.utils.Constants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="salary_seq")
    @SequenceGenerator(name="salary_seq",sequenceName="salary_id_seq", allocationSize=1)
    private Long id;
    private Double amount;
    private Constants.TypeSalary frequency;
    @OneToOne
    @JoinColumn(name = "rol_id", referencedColumnName = "id")
    private Rol rolId;
}
