package domain;

public class Sueldo extends Suenio {
    private double sueldoDeseado;

    @Override
    protected void cumplirParaUnaPersona(Persona persona) {

    }

    @Override
    public boolean sePuedeCumplir(Persona persona) {
        return (persona.getSueldo() >= this.sueldoDeseado);
    }

    public double getSueldoDeseado() {
        return sueldoDeseado;
    }

    public void setSueldoDeseado(double sueldoDeseado) {
        this.sueldoDeseado = sueldoDeseado;
    }
}
