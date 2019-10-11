package domain;

public class Local extends Inmueble {
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

    @Override
    public void vender(double comision) {    }
}
