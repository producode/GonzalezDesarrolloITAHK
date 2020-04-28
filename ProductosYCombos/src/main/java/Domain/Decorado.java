package Domain;

public abstract class Decorado extends Producto{
    private Producto producto;
    private String nombre;

    public Decorado(String nombre) {
        super(nombre);
        this.nombre = nombre;
    }

    public Double precio(){
        return 0.0;
    }

    public Producto getProducto() {
        return producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
