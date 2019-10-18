package domain;

public class Obsesivos implements TiposPersonas {
    @Override
    public void cumplirSueniosPendientes(Persona persona) {
        persona.agregarSuenio(persona.getSueniosPendientes().get(0));
    }
}
