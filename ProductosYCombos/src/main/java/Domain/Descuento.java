package Domain;

public class Descuento extends Decorado{
    private Double valor;

    public Descuento(String nombre) {
        super(nombre);
    }

    @Override
    public Double precio(){
        return this.getProducto().precio() * valor/100;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
