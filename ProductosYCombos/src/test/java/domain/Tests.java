package domain;

import Domain.Producto;
import Domain.ProductoSimple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Tests {
    ArrayList<Producto> productos;
    @Before
    public void init(){
        Producto nuevoProducto = new ProductoSimple("rueda",200.0);
        productos.add(nuevoProducto);
        nuevoProducto = new ProductoSimple("volante",100.0);
    }

    @Test
    public void Comer(){
        Assert.assertEquals(java.util.Optional.ofNullable(productos.get(0).precio()),200.0);
    }
}
