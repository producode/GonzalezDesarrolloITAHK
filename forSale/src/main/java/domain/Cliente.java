package domain;

public class Cliente {
    private String nombre;
    private int DNI;

    public void SolicitarReserva(Inmueble unInmueble, Empleado unEmpleado){
        unEmpleado.reservarInmueble(unInmueble, this);
    }
    public void SolicitarConcretar(Inmueble unInmueble, Empleado unEmpleado){
        unEmpleado.concretarInmueble(unInmueble, this);
    }
}
