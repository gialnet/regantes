package es.gialnet.prodacon.regantes.comuneros;

import java.io.Serializable;

public class TuplasComuneros implements Serializable {

    private static final long serialVersionUID = 1L;

    String codigo;
    String nombre;
    String apellidos;
    String movil;
    String email;

    public TuplasComuneros() {
    }

    public TuplasComuneros(String codigo, String nombre, String apellidos, String movil, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.movil = movil;
        this.email = email;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getMovil() {
        return movil;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "TuplasComuneros{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", movil='" + movil + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
