package taller.BD.Server;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Consumos {
    @Id
    @GeneratedValue
    private Integer id_Consumos;
    private Date fecha;
    private Float lectura;

    @ManyToOne()
    @JoinColumn(name = "med")
    private Medidor med;
    @OneToOne(mappedBy = "con")
    @JsonIgnore
    private Facturas fac;

    public Consumos() {
    }
    public Integer getId_Consumos() {
        return id_Consumos;
    }
    public void setId_Consumos(Integer id_Consumos) {
        this.id_Consumos = id_Consumos;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Float getLectura() {
        return lectura;
    }
    public void setLectura(Float lectura) {
        this.lectura = lectura;
    }
    public Medidor getMed() {
        return med;
    }
    public void setMed(Medidor med) {
        this.med = med;
    }
    public Facturas getFac() {
        return fac;
    }
    public void setFac(Facturas fac) {
        this.fac = fac;
    }
    
}
