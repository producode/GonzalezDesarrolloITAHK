package Domain;

public class Packaging extends Decorado {
    private Double precio;

    public Packaging(String nombre) {
        super(nombre);
    }

    @Override
    public Double precio() {
        return this.getProducto().precio() + this.precio;
    }

    public Double getPrecioIndividual() {
        return precio;
    }

    public void setPrecioIndividual(Double precio) {
        this.precio = precio;
    }
}
