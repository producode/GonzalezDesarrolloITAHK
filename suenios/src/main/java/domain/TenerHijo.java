package domain;

public class TenerHijo extends Suenio {

    @Override
    protected void cumplirParaUnaPersona(Persona persona) {
        Biologico nuevoHijo = new Biologico();
        persona.agregarHijos(nuevoHijo);
    }

    @Override
    public boolean sePuedeCumplir(Persona persona) {
        return (persona.getHijos().size() == 0);
    }
}
