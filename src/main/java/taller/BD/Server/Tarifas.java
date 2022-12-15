package taller.BD.Server;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tarifas {
    @Id
    @GeneratedValue
    private Long id;
    private Date fechaInic;
    private Integer consumoMax;
    private Float costoUnit;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getFechaInic() {
        return fechaInic;
    }
    public void setFechaInic(Date fecha_inic) {
        this.fechaInic = fecha_inic;
    }
    public Integer getConsumoMax() {
        return consumoMax;
    }
    public void setConsumoMax(Integer consumo_max) {
        this.consumoMax = consumo_max;
    }
    public Float getCostoUnit() {
        return costoUnit;
    }
    public void setCostoUnit(Float costo_unit) {
        this.costoUnit = costo_unit;
    }
    public Tarifas() {
    }
    @Override
    public String toString() {
        return "Tarifas [consumo_max=" + consumoMax + ", costo_unit=" + costoUnit + ", fechaInic=" + fechaInic
                + ", id=" + id + "]";
    }

    
}
