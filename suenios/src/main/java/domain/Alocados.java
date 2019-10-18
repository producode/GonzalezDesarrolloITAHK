package domain;

public class Alocados implements TiposPersonas {
    @Override
    public void cumplirSueniosPendientes(Persona persona) {
        persona.getSueniosPendientes().forEach(suenio -> {
            persona.agregarSuenio(suenio);
        });
    }
}
