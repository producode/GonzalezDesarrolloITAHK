package domain;

import domain.AccionesEjecutables.AbrirAplicacion;
import domain.EstrategiasEjecucion.EjecucionParalela;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Tarea abrirChromeTask = new Tarea(new EjecucionParalela());

        AbrirAplicacion abrirChrome = new AbrirAplicacion("notepad");

        abrirChromeTask.agregarAccion(abrirChrome);
    }
}
