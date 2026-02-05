package org.palomafp.shein.modelo;
public class Modelo {
    private String nombre;
    private String apellido;
    private long telefono;
    private String dni;
    private String correo;
    private Genero genero;

    public enum Genero {
        MASCULINO, FEMENINO, OTRO
    }

    public Modelo() {
    }

    public Modelo(String nombre, String apellido, long telefono, String dni, String correo, Genero genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.correo = correo;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", dni='" + dni + '\'' +
                ", correo='" + correo + '\'' +
                ", genero=" + genero +
                '}';
    }
}
