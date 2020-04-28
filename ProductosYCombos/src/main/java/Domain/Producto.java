package Domain;

public abstract class Producto {
    private String nombre;
    private String marca;

    public Producto(String nombre, String marca){
        this.nombre = nombre;
        this.marca = marca;
    }

    public Producto(String nombre){
        this.nombre = nombre;
    }

    public Double precio(){
        return 0.0;
    }

    public int stock(){
        return 0;
    }
}
