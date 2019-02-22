package br.com.raiadrogasil.encomendasservices;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "area")
public class Area implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    private long idArea;

    private String dsArea;

    public long getIdArea() {
        return idArea;
    }

    public void setIdArea(long idArea) {
        this.idArea = idArea;
    }
    

    /**
     * @return the dsArea
     */
    public String getDsArea() {
        return dsArea;
    }

    /**
     * @param dsArea the dsArea to set
     */
    public void setDsArea(String dsArea) {
        this.dsArea = dsArea;
    }
    
}