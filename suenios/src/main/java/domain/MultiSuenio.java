package domain;

import java.util.ArrayList;

public class MultiSuenio extends Suenio {
    private ArrayList<Suenio> suenios = new ArrayList<Suenio>();

    @Override
    protected void cumplirParaUnaPersona(Persona persona) {
        for (int a = 0; a < suenios.size(); a = a + 1) {
            suenios.get(a).cumplirSuenio(persona);
        }
    }

    @Override
    public boolean sePuedeCumplir(Persona persona) {
        boolean cumpleTodos = true;
        for(int a = 0; a < suenios.size(); a = a + 1){
            if(suenios.get(a).sePuedeCumplir(persona) == false){
                cumpleTodos = false;
            }
        }
        return cumpleTodos;
    }

    @Override
    public int getRecompensa() {
        int totalRecompensa = 0;
        for(int a = 0; a < suenios.size(); a = a + 1){
            totalRecompensa = totalRecompensa + suenios.get(0).getRecompensa();
        }
        return totalRecompensa;
    }

    public void agregarSuenios(Suenio nuevoSuenio) {
        this.suenios.add(nuevoSuenio);
    }
}
