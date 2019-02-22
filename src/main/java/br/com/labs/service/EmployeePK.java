package br.com.labs.services;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class EmployeePK implements Serializable {

    private static final long serialVersionUID = 1L;

    private LocalDateTime dtEmployee;
    private int cdStatusEmployee;
    private long cdProduct;
    private long cdSector;

    public EmployeePK(){
    }
    public EmployeePK (long cdSector, long cdProduct, LocalDateTime dtEmployee, int cdStatusEmployee) {
        this.cdSector = cdSector; this.cdProduct = cdProduct; this.dtEmployee = dtEmployee; this.cdStatusEmployee = cdStatusEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeePK)) return false;
        EmployeePK that = (EmployeePK) o;
        return Objects.equals(getCdSector(), that.getCdSector()) &&
                Objects.equals(getCdProduct(), that.getCdProduct()) && 
                Objects.equals(getDtEmployee(), that.getDtEmployee()) &&
                Objects.equals(getCdStatusEmployee(), that.getCdStatusEmployee());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getCdSector(), getCdProduct(), getDtEmployee(), getCdStatusEmployee());
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return getCdSector() + "-" + getCdProduct() + "-" + getDtEmployee().format(formatter) + "-" + getCdStatusEmployee();
    }

    public long getCdSector() {
        return cdSector;
    }
    public void setCdSector(long cdSector) {
        this.cdSector = cdSector;
    }

    public long getCdProduct() {
        return cdProduct;
    }
    public void setCdProduct(long cdProduct) {
        this.cdProduct = cdProduct;
    }

    public LocalDateTime getDtEmployee() {
        return dtEmployee;
    }
    public void setDtEmployee(LocalDateTime dtEmployee) {
        this.dtEmployee = dtEmployee;
    }

    public int getCdStatusEmployee() {
        return cdStatusEmployee;
    }
    public void setCdStatusEmployee(int cdStatusEmployee) {
        this.cdStatusEmployee = cdStatusEmployee;
    }
}