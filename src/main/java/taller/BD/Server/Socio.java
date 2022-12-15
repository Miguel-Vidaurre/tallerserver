package taller.BD.Server;

import java.sql.Date;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Socios")
public class Socio {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "Cel", length = 10)
    private String celular;
    @Column(name = "Nom", length = 15)
    private String nombres;
    @Column(name = "Ape", length = 20)
    private String apellidos;
    private String ci;
    private String correo;
    private Boolean activo;
    private byte[] foto;
    private Date fechaNacimiento;
    private Date fechaRegistro;
    private String direccion;
    @OneToOne(cascade = CascadeType.REMOVE,optional = true)
    private Usuario usr;
    @OneToOne()
    private Facturas fact;
    @OneToMany(mappedBy = "soc")
    @JsonIgnore
    Set<Solicitudes> solicitudes;
    @OneToMany(mappedBy = "soci")
    @JsonIgnore
    Set<Medidor> medidores;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Boolean getActivo() {
        return activo;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    public byte[] getFoto() {
        return foto;
    }
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Usuario getUsr() {
        return usr;
    }
    public void setUsr(Usuario usr) {
        this.usr = usr;
    }
    public Facturas getFact() {
        return fact;
    }
    public void setFact(Facturas fact) {
        this.fact = fact;
    }
    public Set<Solicitudes> getSolicitudes() {
        return solicitudes;
    }
    public void setSolicitudes(Set<Solicitudes> solicitudes) {
        this.solicitudes = solicitudes;
    }
    public Set<Medidor> getMedidores() {
        return medidores;
    }
    public void setMedidores(Set<Medidor> medidores) {
        this.medidores = medidores;
    }

}
