package domain;

import domain.AccionesEjecutables.Accion;
import domain.EstrategiasEjecucion.EstrategiaDeEjecucion;
import domain.Observadores.IObservable;
import domain.Observadores.IObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;

public class Tarea implements IObservable {
    private ArrayList<Accion> acciones;
    private String descripcion;
    private Estado estado;
    private EstrategiaDeEjecucion estrategia;
    private int intervaloDeEjecucion;
    private String nombre;
    private ArrayList<IObserver> observadores;

    public Tarea(EstrategiaDeEjecucion estrategia){
        this.estrategia = estrategia;
        this.acciones = new ArrayList<Accion>();
        this.observadores = new ArrayList<IObserver>();
        this.estado = Estado.INICIADA;
    }

    public ArrayList<Accion> getAcciones() {
        return acciones;
    }

    private void cambiarEstadoYNotificar(Estado nuevoEstado){
        this.estado = nuevoEstado;
        this.notificar();
    }

    public void agregarAccion(Accion accion){
        this.acciones.add(accion);
    }

    public void cambiarEstrategiaDeEjecucion(EstrategiaDeEjecucion estrategia){
        this.estrategia = estrategia;
    }

    public void ejecutar(){
        this.cambiarEstadoYNotificar(Estado.EN_EJECUCION);
        this.estrategia.ejecutar(this);
        this.cambiarEstadoYNotificar(Estado.FINALIZADA);
    }

    @Override
    public void notificar() {
        this.observadores.forEach(o -> o.serNotificadoPor(this));
    }

    @Override
    public void agregarObserver(IObserver... observers) {
        Collections.addAll(this.observadores, observers);
    }

    @Override
    public void eliminarObserver(IObserver observer) {
        this.observadores.remove(observer);
    }
}
