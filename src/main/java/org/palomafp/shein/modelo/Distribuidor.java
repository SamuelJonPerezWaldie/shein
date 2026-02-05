package org.palomafp.shein.modelo;
public class Distribuidor {
    private String id;
    private long telefono;
    private String correo;
    private String procedencia;

    public Distribuidor() {
    }

    public Distribuidor(String id, long telefono, String correo, String procedencia) {
        this.id = id;
        this.telefono = telefono;
        this.correo = correo;
        this.procedencia = procedencia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return "Distribuidor{" +
                "id='" + id + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", procedencia='" + procedencia + '\'' +
                '}';
    }
}
