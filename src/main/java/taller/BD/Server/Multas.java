package taller.BD.Server;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Multas {
    @Id
    @GeneratedValue
    private Integer id_Multas;
    @Column(nullable = false)
    private Date FechaVigencia;
    @Column(nullable = false)
    private BigDecimal monto;

    public Integer getId_Multas() {
        return id_Multas;
    }
    public void setId_Multas(Integer id_Multas) {
        this.id_Multas = id_Multas;
    }
    public Date getFechaVigencia() {
        return FechaVigencia;
    }
    public void setFechaVigencia(Date fechaVigencia) {
        FechaVigencia = fechaVigencia;
    }
    public BigDecimal getMonto() {
        return monto;
    }
    public void setMonto(BigDecimal monto) {
        if(monto.doubleValue()>0) this.monto = monto;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((FechaVigencia == null) ? 0 : FechaVigencia.hashCode());
        result = prime * result + ((id_Multas == null) ? 0 : id_Multas.hashCode());
        result = prime * result + ((monto == null) ? 0 : monto.hashCode());
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
        Multas other = (Multas) obj;
        if (FechaVigencia == null) {
            if (other.FechaVigencia != null)
                return false;
        } else if (!FechaVigencia.equals(other.FechaVigencia))
            return false;
        if (id_Multas == null) {
            if (other.id_Multas != null)
                return false;
        } else if (!id_Multas.equals(other.id_Multas))
            return false;
        if (monto == null) {
            if (other.monto != null)
                return false;
        } else if (!monto.equals(other.monto))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Multas [FechaVigencia=" + FechaVigencia + ", id_Multas=" + id_Multas + ", monto=" + monto + "]";
    }

    

}
