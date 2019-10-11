package domain;

public class Alquiler extends Operacion {
    private int meses;
    private int dividir = 50000;

    @Override
    public double calcularComision(Inmueble unInmueble) {
        return (unInmueble.getValorNeto()*this.meses)/this.dividir;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
}
