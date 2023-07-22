package com.rinku.backoffice.persistence.model;

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
public class WorkingDay {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="working_day_seq")
    @SequenceGenerator(name="working_day_seq",sequenceName="working_day_id_seq", allocationSize=1)
    private Long id;
    private Long daysToWeek;
    private Long hoursToDay;
    @OneToOne
    @JoinColumn(name="rol_id",referencedColumnName = "id")
    private Rol rolId;
}
