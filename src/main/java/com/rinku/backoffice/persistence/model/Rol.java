package com.rinku.backoffice.persistence.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="rol_seq")
    @SequenceGenerator(name="rol_seq",sequenceName="pk_rol", allocationSize=1)
    private Long id;
    private String description;
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date createdAt;
    private String createdBy;
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date modifiedAt;
    private String modifiedBy;
    private boolean deleted;

}
