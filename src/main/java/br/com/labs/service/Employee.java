package br.com.labs.service;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

    private static final Long serialVersionUID = 2L;

    @EmbeddedId
    private EmployeePK id;
    
    private Long idClient;
    @Column(name = "dtFinish")
    private LocalDateTime dtFinish;
    private Integer cdEmployeeOrigin;
    private boolean flCanceled;


    public EmployeePK getId() {
        return id;
    }
    public void setId(EmployeePK id) {
        this.id = id;
    }

    public Long getIdClient() {
        return idClient;
    }
    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }
    
    public LocalDateTime dtFinish() {
        return dtFinish;
    }




}
