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
    public void crearCliente(int DNI, String nombre){
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }
}
