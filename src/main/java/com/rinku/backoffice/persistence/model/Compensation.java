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
public class Compensation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="compensation_seq")
    @SequenceGenerator(name="compensation_seq",sequenceName="compensation_id_seq", allocationSize=1)
    private Long id;
    private String concept;
    private Double amount;
    private Constants.TypeMoviment type;
    private Constants.TypeSalary frequency;

    @ManyToOne
    @JoinColumn(name = "rol_id",referencedColumnName = "id")
    private Rol rolId;
}
