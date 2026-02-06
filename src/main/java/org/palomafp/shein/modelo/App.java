package org.palomafp.shein.modelo;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        // 1. Probando clase  Distribuidor
        Distribuidor dist1 = new Distribuidor("D001", 600123456L, "contacto@distri.es", "España");
        List<Distribuidor> listaDistribuidores = new ArrayList<>();
        listaDistribuidores.add(dist1);

        // 2 Probando clase Modelo
        Modelo modelo1 = new Modelo("Lucía", "García", 655443322L, "12345678Z", "lucia@model.com", Modelo.Genero.FEMENINO);

        // 3.Probando clase Modelo
        Categoria catRopa = new Categoria(new ArrayList<>(), "Camisetas", Categoria.Genero.FEMENINO);

        // 4. Probando clase Producto
        Producto camiseta1 = new Producto(
            1001, "M", "Blanco", "15.99€", "Algodón", 
            modelo1, catRopa, listaDistribuidores
        );

        // 5.Probando clase categoria
        catRopa.getProductos().add(camiseta1);

        // 6. Probando clase local
        List<Producto> stockLocal = new ArrayList<>();
        stockLocal.add(camiseta1);
        Local tiendaCentro = new Local(stockLocal, "Calle Mayor 1", "M-01", 912345678L);

        // --- PRUEBAS POR CONSOLA ---
        System.out.println("=== PRUEBA DE CLASES SHEIN ===");
        System.out.println("\n--- Datos del Local ---");
        System.out.println(tiendaCentro);

        System.out.println("\n--- Datos del Producto ---");
        System.out.println("Código: " + camiseta1.getCodigo() + " | Color: " + camiseta1.getColor());
        System.out.println("Modelo asignado: " + camiseta1.getModelo().getNombre());
        
        System.out.println("\n--- Datos del Distribuidor ---");
        System.out.println(dist1);
    }
}