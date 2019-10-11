package domain;

public class Departamento extends Inmueble {
    private double valorAmbientes = 350000;

    @Override
    public double calcularValorInmueble(){
        return (getCantidadAmbientes()*this.valorAmbientes);
    }

    @Override
    public double getValorNeto() {
        return this.calcularValorInmueble() + this.plus();
    }

    public void setValorAmbientes(double valorAmbientes) {
        this.valorAmbientes = valorAmbientes;
    }

    public double getValorAmbientes() {
        return valorAmbientes;
    }
}
