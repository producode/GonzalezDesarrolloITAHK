package domain.AccionesEjecutables;

import domain.Observadores.IObservable;

import java.util.ArrayList;

public abstract class Accion {
    private ArrayList<IObservable> observers;

    public void ejecutar(){

    }

    public void notificar(){

    }

    public void agregarObservable(IObservable observable){
        this.observers.add(observable);
    }
}
