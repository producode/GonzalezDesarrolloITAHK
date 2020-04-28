package Domain;

public class ProductoSimple extends Producto {
    private Double precio;
    private int stock;

    public ProductoSimple(String nombre, String marca, Double precio) {
        super(nombre, marca);
        this.precio = precio;
    }

    public ProductoSimple(String nombre, Double precio){
        super(nombre);
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public Double precio(){
        return this.precio;
    }

    @Override
    public int stock(){
        return this.stock;
    }
}
