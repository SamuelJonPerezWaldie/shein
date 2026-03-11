package org.palomafp.shein;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.palomafp.shein.modelo.Producto;

public class ProductosDAOTest {

    @Test
    void testInicializacionDAO() {
        ProductosDAO dao = new ProductosDAO();

        assertNotNull(dao.getAllProductos(), "Lista de productos no puede ser vacía");
        assertNotNull(dao.getProductoByCodigo(1001), "Existe un producto con código 1001 según la inicialización");
    }

    @Test
    void getProductoRandomEmpty() {
        ProductosDAO dao = new ProductosDAO();
        dao.clearAll();
        Producto resultado = dao.getProductoRandom();
        assertNull(resultado);
    }

    @Test
    void getProductoRandom() {
        ProductosDAO dao = new ProductosDAO();
        Producto resultado = dao.getProductoRandom();
        assertNotNull(resultado, "El producto random no puede ser null");
        assertNotNull(resultado.getCategoria(), "La categoría no puede ser null");
        assertNotNull(resultado.getCodigo(), "El código no puede ser null");
        assertNotNull(resultado.getColor(), "El color no puede ser null");
        assertNotNull(resultado.getPrecio(), "El precio no puede ser null");
        assertNotEquals(0, resultado.getPrecio(), "El precio tiene que ser mayor que 0");
        assertNotNull(resultado.getDistribuidor(), "El distribuidor no puede ser null");
        assertNotNull(resultado.getTalla(), "La talla no puede ser null");
    }

    @Test
    void getProductoByCodigoNull() {
        ProductosDAO dao = new ProductosDAO();
        Producto resultado = dao.getProductoByCodigo(null);
        assertNull(resultado, "Cuando el código es nulo");
    }

    @Test
    void getProductoByCodigoReal() {
    ProductosDAO dao = new ProductosDAO();
    Producto resultado = dao.getProductoByCodigo(1001);
    assertEquals(null, resultado, "Sale null al ya existir ese código");
    }
}
