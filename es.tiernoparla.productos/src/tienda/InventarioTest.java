package tienda;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class InventarioTest {
    @Test
    void testActualizarStock() {

    }

    @Test
    void testAñadirProducto() {
        Inventario inv = new Inventario();
        Producto product = new Producto("123", "galletas", 50, 8);
        inv.añadirProducto(product);
        inv.listarProductos();
        List<Producto> listaProd = inv.listarProductos();
        listaProd.get(0);
        assertEquals("123",listaProd.get(0).getCodigo(),  "el codigo tiene que ser 123");
        

    }

    
    @Test
    void testBuscarProductoPorCodigo() {
        Inventario inv = new Inventario();
        Producto product = new Producto("123", "galletas", 50, 8);
        inv.añadirProducto(product);
        inv.listarProductos();
        List<Producto> listaProd = inv.listarProductos();
        inv.buscarProductoPorCodigo("123"); 
        assertEquals("123",listaProd.get(0).getCodigo(),  "el codigo tiene que ser 123");
        

    }

    @Test
    void testEliminarProducto() {
        Inventario inv = new Inventario();
        Producto product = new Producto("123", "galletas", 50, 8);
        inv.añadirProducto(product);
        inv.listarProductos();
        List<Producto> listaProd = inv.listarProductos();
        inv.eliminarProducto("123");
        inv.buscarProductoPorCodigo("123"); 
        assertNull(inv.buscarProductoPorCodigo("123"), "No valido");


    }

    @Test
    void testListarProductos() {
        Inventario inv = new Inventario();
        Producto product = new Producto("123", "galletas", 50, 8);
        Producto p2 = null;
        inv.añadirProducto(product);
        inv.listarProductos();
        List<Producto> listaProd = inv.listarProductos();
        p2 = listaProd.get(0);
        assertNotNull(p2, "No puede ser nulo");
       

    }
}
