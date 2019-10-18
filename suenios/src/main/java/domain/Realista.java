package domain;

public class Realista implements TiposPersonas {
    @Override
    public void cumplirSueniosPendientes(Persona persona) {
        persona.agregarSuenio(persona.getSuenioMasImportante());
    }
}
