package domain;

public class Viajar extends Suenio {
    private String lugar;

    @Override
    protected void cumplirParaUnaPersona(Persona persona) {
        persona.agregarViaje(lugar);
    }

    @Override
    public boolean sePuedeCumplir(Persona persona) {
        return persona.puedeAgregarViaje(lugar);
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
