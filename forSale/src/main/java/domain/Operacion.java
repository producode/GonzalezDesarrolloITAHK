package domain;

public class Operacion {
    private EstadoOperacion estado;
    private Empleado empleadoReservante;
    private Empleado empleadoConcretante;

    public double calcularComicion(double valor){
        return valor;
    }
    public void reservarse(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble){
        this.estado.reservar(unCliente,unEmpleado,this);
    }
    public void concretarse(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble){
        this.estado.concretar(unCliente,unEmpleado,this);
    }
    public void setEstado(EstadoOperacion estado) {
        this.estado = estado;
    }
    public void setEmpleadoReservante(Empleado empleadoReservante) {
        this.empleadoReservante = empleadoReservante;
    }
    public void setEmpleadoConcretante(Empleado empleadoConcretante){
        this.empleadoConcretante = empleadoConcretante;
    }
}
