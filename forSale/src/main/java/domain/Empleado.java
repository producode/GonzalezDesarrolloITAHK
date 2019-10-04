package domain;

public class Empleado {
    private String nombre;
    private int DNI;
    public void reservarInmueble(Inmueble unInmueble, Cliente unCliente){
        unInmueble.cambiarReservar(unCliente,this);
    }
    public void concretarInmueble(Inmueble unInmueble, Cliente unCliente){
        unInmueble.cambiarConcretar(unCliente, this);
    }
}
