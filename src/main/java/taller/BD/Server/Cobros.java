package taller.BD.Server;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Cobros {
    @Id
    @GeneratedValue
    private Integer id;
    private Calendar fechahora;
    private Double monto;
    private String ref;
    private Integer tipo;
    @ManyToOne
    private Socio soc;
    @ManyToOne
    private Multas mult;

    @OneToOne(optional = true)
    private Facturas fact;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Calendar getFechahora() {
        return fechahora;
    }
    public void setFechahora(Calendar fechahora) {
        this.fechahora = fechahora;
    }
    public Double getMonto() {
        return monto;
    }
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    public String getRef() {
        return ref;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
    public Integer getTipo() {
        return tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    public Cobros() {
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fechahora == null) ? 0 : fechahora.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cobros other = (Cobros) obj;
        if (fechahora == null) {
            if (other.fechahora != null)
                return false;
        } else if (!fechahora.equals(other.fechahora))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    public Socio getSoc() {
        return soc;
    }
    public void setSoc(Socio soc) {
        this.soc = soc;
    }
    public Multas getMult() {
        return mult;
    }
    public void setMult(Multas mult) {
        this.mult = mult;
    }
    public Facturas getFact() {
        return fact;
    }
    public void setFact(Facturas fact) {
        this.fact = fact;
    }
    @Override
    public String toString() {
        return "Cobros [fact=" + fact + ", fechahora=" + fechahora + ", id=" + id + ", monto=" + monto + ", mult="
                + mult + ", ref=" + ref + ", soc=" + soc + ", tipo=" + tipo + "]";
    }
   
}
