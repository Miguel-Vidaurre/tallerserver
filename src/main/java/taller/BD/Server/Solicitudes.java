package taller.BD.Server;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Solicitudes {
    @Id
    @GeneratedValue
    private Integer id;
    private String detalle;
    private Date fecha;
    private Boolean atendido=false;
    @ManyToOne
    private Socio soc;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Boolean getAtendido() {
        return atendido;
    }
    public void setAtendido(Boolean atendido) {
        this.atendido = atendido;
    }
    public Solicitudes() {
    }
    public Socio getSoc() {
        return soc;
    }
    public void setSoc(Socio soc) {
        this.soc = soc;
    }
    @Override
    public String toString() {
        return "Solicitudes [atendido=" + atendido + ", detalle=" + detalle + ", fecha=" + fecha + ", id=" + id
                + ", soc=" + soc + "]";
    }
    
}
