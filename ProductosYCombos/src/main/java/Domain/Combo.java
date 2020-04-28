package Domain;

import java.util.ArrayList;

public class Combo extends Producto{
    ArrayList<Producto> productos;


    public Combo(String nombre, String marca) {
        super(nombre, marca);
    }

    public Combo(String nombre){
        super(nombre);
    }

    public void IngresarProducto(Producto nuevoProducto){
        productos.add(nuevoProducto);
    }

    public void eliminarProducto(Producto viejoProducto){
        productos.remove(viejoProducto);
    }

    @Override
    public Double precio(){
        return this.productos.stream().mapToDouble(value -> value.precio()).sum();
    }

    @Override
    public int stock(){
        return this.productos.stream().mapToInt(value -> value.stock()).sum();
    }
}
