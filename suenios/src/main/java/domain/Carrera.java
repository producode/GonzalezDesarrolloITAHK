package domain;

public class Carrera extends Suenio {
    private String carrera;

    @Override
    protected void cumplirParaUnaPersona(Persona persona) {
        persona.agregarCarreras(carrera);
    }

    @Override
    public boolean sePuedeCumplir(Persona persona) {
        return (persona.puedeAgregarCarrera(this.carrera) && persona.quiereEstudiarLaCarrera(this.carrera));
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
