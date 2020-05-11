package domain;

import domain.AccionesEjecutables.AbrirAplicacion;
import domain.EstrategiasEjecucion.EjecucionParalela;

public class Main {
    public static void main(String[] args) {
        Tarea abrirChromeTask = new Tarea(new EjecucionParalela());

        AbrirAplicacion abrirChrome = new AbrirAplicacion();

        abrirChromeTask.agregarAccion(abrirChrome);
    }
}
