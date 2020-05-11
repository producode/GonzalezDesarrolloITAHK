package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TimerTask;

public class EjecutadorDeTareas extends TimerTask {
    private int intervaloDeEjecucion;
    private ArrayList<Tarea> tareas;

    public EjecutadorDeTareas(){
        this.tareas = new ArrayList<Tarea>();
    }

    @Override
    public void run(){
        this.tareas.forEach(Tarea::ejecutar);
    }

    public void agregarTarea(Tarea ... tareas){
        Collections.addAll(this.tareas, tareas);
    }


}
