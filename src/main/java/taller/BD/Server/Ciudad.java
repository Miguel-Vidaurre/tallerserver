package taller.BD.Server;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ciudad {
    @Id
    @GeneratedValue
    private Integer id_Ciudad;
    private String Departamento;
    private String minicipio;
    private String Ciudad;

    

    public Ciudad() {
    }
    public Integer getId_Ciudad() {
        return id_Ciudad;
    }
    public void setId_Ciudad(Integer id_Ciudad) {
        this.id_Ciudad = id_Ciudad;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
    public String getMinicipio() {
        return minicipio;
    }
    public void setMinicipio(String minicipio) {
        this.minicipio = minicipio;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Ciudad == null) ? 0 : Ciudad.hashCode());
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
        Ciudad other = (Ciudad) obj;
        if (Ciudad == null) {
            if (other.Ciudad != null)
                return false;
        } else if (!Ciudad.equals(other.Ciudad))
            return false;
        return true;
    }

    


    
}
