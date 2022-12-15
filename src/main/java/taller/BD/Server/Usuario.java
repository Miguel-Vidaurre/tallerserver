package taller.BD.Server;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario {
    @Id
    @Column(length=10,nullable = false)
    private String Login;
    @Column(nullable = false)
    private String Clave;
    @ManyToMany(mappedBy = "users",fetch = FetchType.EAGER)
    @JsonIgnore
    Set<Roles> roles;

    public Usuario() {
    }
    public String getLogin() {
        return Login;
    }
    public void setLogin(String Login) {
        this.Login = Login;
    }
    public String getClave() {
        return Clave;
    }
    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    //Eventos JPA para operaciones previas a persistir en la BD
    @PrePersist
    public void nuevo() {
        Clave= new BCryptPasswordEncoder().encode(Clave);
        System.out.println("nuevo  "+Login+" "+Clave);
    }
    
    @PreUpdate
    public void actualizado() {
        Clave= new BCryptPasswordEncoder().encode(Clave);
        System.out.println("actualizado "+Clave+" "+Login);
    }
    public Set<Roles> getRoles() {
        return roles;
    }
    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }
}
