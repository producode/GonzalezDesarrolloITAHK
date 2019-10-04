package domain;

public class Reservado implements EstadoOperacion{
    private Cliente clienteReservo;

    @Override
    public void reservar(Cliente unCliente, Empleado unEmpleado, Operacion miOperacion) {

    }

    @Override
    public void concretar(Cliente unCliente, Empleado unEmpleado, Operacion miOperacion) {

    }

    public void setClienteReservo(Cliente clienteReservo) {
        this.clienteReservo = clienteReservo;
    }

    @Override
    public Cliente getCliente() {
        return clienteReservo;
    }
}
