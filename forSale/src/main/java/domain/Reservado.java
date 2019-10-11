package domain;

public class Reservado implements EstadoOperacion{
    private Cliente clienteReservo;

    @Override
    public void reservar(Cliente unCliente, Empleado unEmpleado, Operacion miOperacion) {

    }

    @Override
    public void concretar(Cliente unCliente, Empleado unEmpleado, Operacion miOperacion,Inmueble unInmueble) {
        Concretado nuevaCompra = new Concretado();
        nuevaCompra.setClienteConcreto(unCliente);
        miOperacion.setEstado(nuevaCompra);
        miOperacion.setEmpleadoConcretante(unEmpleado);
        unEmpleado.agregarRegistro(unInmueble);
    }

    public void setClienteReservo(Cliente clienteReservo) {
        this.clienteReservo = clienteReservo;
    }

    @Override
    public Cliente getCliente() {
        return clienteReservo;
    }
}
