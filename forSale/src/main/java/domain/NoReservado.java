package domain;

public class NoReservado implements EstadoOperacion{
    @Override
    public void reservar(Cliente unCliente, Empleado unEmpleado, Operacion miOperacion) {
        Reservado nuevaReserva = new Reservado();
        nuevaReserva.setClienteReservo(unCliente);
        miOperacion.setEstado(nuevaReserva);
        miOperacion.setEmpleadoReservante(unEmpleado);
    }

    @Override
    public void concretar(Cliente unCliente, Empleado unEmpleado, Operacion miOperacion, Inmueble unInmueble) {
        Concretado nuevaCompra = new Concretado();
        nuevaCompra.setClienteConcreto(unCliente);
        miOperacion.setEstado(nuevaCompra);
        miOperacion.setEmpleadoConcretante(unEmpleado);
        unEmpleado.agregarRegistro(unInmueble);
    }

    @Override
    public Cliente getCliente() {
        return null;
    }
}
