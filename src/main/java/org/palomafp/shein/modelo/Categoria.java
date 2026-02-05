package org.palomafp.shein.modelo;
import java.util.List;
public class Categoria {
    private List<Producto> productos;
    private String tipo;
    private Genero genero;

    public enum Genero {
        MASCULINO, FEMENINO, UNISEX
    }

    public Categoria() {
    }

    public Categoria(List<Producto> productos, String tipo, Genero genero) {
        this.productos = productos;
        this.tipo = tipo;
        this.genero = genero;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "productos=" + productos +
                ", tipo='" + tipo + '\'' +
                ", genero=" + genero +
                '}';
    }
}
