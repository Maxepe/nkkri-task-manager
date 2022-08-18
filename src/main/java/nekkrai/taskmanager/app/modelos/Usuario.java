package nekkrai.taskmanager.app.modelos;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    private Long id;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "telefono")
    private Integer telefono;

    @Column(name = "habilitado")
    private boolean habilitado;

    @Column(name = "bloqueado")
    private boolean bloqueado;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "email")
    private String email;

    @Column(name = "id_pais")
    private Integer idPais;

    public Usuario() {

    }

    public Usuario(Long id, String nombreUsuario, String contrasena, boolean habilitado, boolean bloqueado, Integer edad, String email, Integer idPais) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.habilitado = habilitado;
        this.bloqueado = bloqueado;
        this.edad = edad;
        this.email = email;
        this.idPais = idPais;
    }


    /* GETTERS Y SETTERS */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }
}
