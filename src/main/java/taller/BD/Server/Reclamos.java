package taller.BD.Server;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Reclamos extends Solicitudes {
    private Date fechaatencion;
    private String resultado;
    public Date getFechaatencion() {
        return fechaatencion;
    }
    public void setFechaatencion(Date fechaatencion) {
        this.fechaatencion = fechaatencion;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    @Override
    public String toString() {
        return "Reclamos [fechaatencion=" + fechaatencion + ", resultado=" + resultado + "]";
    }

    
}
