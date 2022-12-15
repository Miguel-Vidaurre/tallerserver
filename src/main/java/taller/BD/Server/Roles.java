package taller.BD.Server;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Roles {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false,unique = true)
    private String Autoridad;
    @Column(nullable = false)
    private String Descripcion;
    @Column(nullable = false)
    private Boolean activo;

    @ManyToMany(cascade = {})
    Set<Usuario> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getAutoridad() {
        return Autoridad;
    }

    public void setAutoridad(String autoridad) {
        Autoridad = autoridad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Set<Usuario> getUsers() {
        return users;
    }

    public void setUsers(Set<Usuario> users) {
        this.users = users;
    }

    public Roles() {
        activo=true;
    }
   
}
