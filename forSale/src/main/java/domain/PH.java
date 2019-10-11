package domain;

public class PH extends Inmueble {
    private double valorMinimo = 500000;
    private double valorMetrosCuadrados = 14000;

    @Override
    public double calcularValorInmueble(){
        return (this.valorMinimo + (getMetrosCuadrados()*this.valorMetrosCuadrados));
    }

    @Override
    public double getValorNeto() {
        return this.calcularValorInmueble() + this.plus();
    }

    public void setValorMetrosCuadrados(double valorMetrosCuadrados) {
        this.valorMetrosCuadrados = valorMetrosCuadrados;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public double getValorMetrosCuadrados() {
        return valorMetrosCuadrados;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }
}
