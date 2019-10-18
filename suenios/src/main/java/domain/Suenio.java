package domain;

public abstract class Suenio {
    private int recompensa;

    public void cumplirSuenio(Persona persona){
        if(!persona.estaCumplido(this)){
            verificarCondicionesPara(persona);
            cumplirParaUnaPersona(persona);
            persona.agregarFelicidonios(this.getRecompensa());
            persona.agregarSuenioCumplido(this);
        }
    }


    protected void verificarCondicionesPara(Persona persona){
        if(!this.sePuedeCumplir(persona)){
            if(!persona.tieneYaElSuenioEnPendientes(this)) {
                persona.agregarSuenioPendiente(this);
            }
            throw new NoPuedeRecibirException();
        }
    };

    protected abstract void cumplirParaUnaPersona(Persona persona);

    public boolean sePuedeCumplir(Persona persona){
        return false;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public int getRecompensa() {
        return recompensa;
    }
}
