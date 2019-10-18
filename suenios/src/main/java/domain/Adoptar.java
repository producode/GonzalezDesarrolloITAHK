package domain;

public class Adoptar extends Suenio {

    @Override
    protected void cumplirParaUnaPersona(Persona persona) {
        Adoptados nuevoHijo = new Adoptados();
        persona.agregarHijos(nuevoHijo);
    }

    @Override
    public boolean sePuedeCumplir(Persona persona) {
        return (persona.getHijos().size() == 0);
    }
}
