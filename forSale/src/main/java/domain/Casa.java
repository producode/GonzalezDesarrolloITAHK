package domain;

public class Casa extends Inmueble {
    private double valor;

    public void setValor(double nuevoValor){
        this.valor = nuevoValor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public double calcularValorInmueble(){
        return (valor);
    }

    @Override
    public double getValorNeto() {
        return this.calcularValorInmueble() + this.plus();
    }
}
