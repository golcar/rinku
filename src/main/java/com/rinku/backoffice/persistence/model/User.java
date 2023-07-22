package com.rinku.backoffice.persistence.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="users")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="user_seq")
    @SequenceGenerator(name="user_seq",sequenceName="user_id_seq", allocationSize=1)
    private Long id;
    private String name;
    private String lastname;
    private String rfc;
    private Date birthdate;
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date createdAt;
    private String createdBy;
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date modifiedAt;
    private String modifiedBy;
    private boolean deleted;
    @OneToOne
    @JoinColumn(name="rol_id",referencedColumnName = "id")
    private Rol rolId;
}
