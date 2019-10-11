package domain;

public class Venta extends Operacion {
    private double comision;

    @Override
    public double calcularComision(Inmueble unInmueble) {
        return unInmueble.getValorNeto()*(this.comision/100);
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
