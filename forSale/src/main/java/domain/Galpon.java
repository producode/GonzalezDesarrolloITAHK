package domain;

public class Galpon extends Inmueble {
    private double valor;

    public void setValor(double nuevoValor){
        this.valor = nuevoValor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public double calcularValorInmueble(){
        return (valor/2);
    }

    @Override
    public double getValorNeto() {
        return this.calcularValorInmueble() + this.plus();
    }

    @Override
    public void vender(double comision) {    }
}
