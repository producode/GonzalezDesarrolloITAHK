package domain;

import Domain.Combo;
import Domain.Producto;
import Domain.ProductoSimple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Tests {
    ArrayList<Producto> productos = new ArrayList<>();
    @Before
    public void init(){
        Producto nuevoProducto = new ProductoSimple("rueda",200.0);
        productos.add(nuevoProducto);
        nuevoProducto = new ProductoSimple("volante",100.0);
        productos.add(nuevoProducto);
        Combo combo = new Combo("rueda y volante");
        System.out.println(productos.get(0));
        combo.IngresarProducto(productos.get(0));
        combo.IngresarProducto(productos.get(1));
        productos.add(combo);
    }

    @Test
    public void iniciacion(){
        Assert.assertEquals(productos.get(0).precio(),200.0,2);
        System.out.println(productos.get(2).precio());
    }
}
