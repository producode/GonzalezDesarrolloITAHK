package domain;

import java.util.Date;

public class Operacion {
    private EstadoOperacion estado;
    private Empleado empleadoReservante = null;
    private Empleado empleadoConcretante = null;
    private Date fechaDeCambioDeEstado;

    public boolean problemasEntreEmpleados(){
        if(this.empleadoConcretante != null && this.empleadoReservante != null) {
            if (this.empleadoConcretante.getDNI() != this.empleadoReservante.getDNI()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public void inicializarOperacion(){
        NoReservado nuevoEstado = new NoReservado();
        setEstado(nuevoEstado);
    }

    public void reservarse(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble){
        this.estado.reservar(unCliente,unEmpleado,this);
    }
    public void concretarse(Cliente unCliente, Empleado unEmpleado, Inmueble unInmueble){
        this.estado.concretar(unCliente,unEmpleado,this, unInmueble);
    }
    public void setEstado(EstadoOperacion estado) {
        this.estado = estado;
        setFechaDeCambioDeEstado();
    }
    public void setEmpleadoReservante(Empleado empleadoReservante) {
        this.empleadoReservante = empleadoReservante;
    }
    public void setEmpleadoConcretante(Empleado empleadoConcretante){
        this.empleadoConcretante = empleadoConcretante;
    }
    public double calcularComision(Inmueble unInmueble){
        return 0;
    }

    public void setFechaDeCambioDeEstado() {
        this.fechaDeCambioDeEstado = new Date();
    }

    public Date getFechaDeCambioDeEstado() {
        return fechaDeCambioDeEstado;
    }
}
