package taller.BD.Server;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Medidor {
    @Id
    @GeneratedValue
    private Integer id_Medidor;
    private String serial;
    private String marca;
    private String reg_Inic;
    private Date fechaInstalacion;
    @ManyToOne(optional = true)
    @JoinColumn(name = "soci")
    private Socio soci;
    @OneToMany(mappedBy = "med")
    @JsonIgnore
    private Set<Consumos> lecturas;
    
    public Medidor() {
    }

    public Integer getId_Medidor() {
        return id_Medidor;
    }

    public void setId_Medidor(Integer id_Medidor) {
        this.id_Medidor = id_Medidor;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReg_Inic() {
        return reg_Inic;
    }

    public void setReg_Inic(String reg_Inic) {
        this.reg_Inic = reg_Inic;
    }

    public Date getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(Date fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public Socio getSoci() {
        return soci;
    }

    public void setSoci(Socio soci) {
        this.soci = soci;
    }

    public Set<Consumos> getLecturas() {
        return lecturas;
    }

    public void setLecturas(Set<Consumos> lecturas) {
        this.lecturas = lecturas;
    }

    @Override
    public String toString() {
        return "Medidor [id_Medidor=" + id_Medidor + ", serial=" + serial + ", marca=" + marca + ", reg_Inic="
                + reg_Inic + ", fechaInstalacion=" + fechaInstalacion + ", soci=" + soci + ", lecturas=" + lecturas
                + "]";
    }
    
 

}
