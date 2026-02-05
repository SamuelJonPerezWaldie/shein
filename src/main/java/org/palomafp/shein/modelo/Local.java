package org.palomafp.shein.modelo;
import java.util.List;

public class Local {
    private List<Producto> productos;
    private String direccion;
    private String codigo;
    private long telefono;

    public Local() {
    }

    public Local(List<Producto> productos, String direccion, String codigo, long telefono) {
        this.productos = productos;
        this.direccion = direccion;
        this.codigo = codigo;
        this.telefono = telefono;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Local{" +
                "productos=" + productos +
                ", direccion='" + direccion + '\'' +
                ", codigo='" + codigo + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
