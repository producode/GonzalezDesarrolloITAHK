package domain;

public class Concretado implements EstadoOperacion{
    private Cliente clienteConcreto;

    @Override
    public void reservar(Cliente unCliente, Empleado unEmpleado, Operacion miOperacion) {

    }

    @Override
    public void concretar(Cliente unCliente, Empleado unEmpleado, Operacion miOperacion, Inmueble unInmueble) {

    }

    public void setClienteConcreto(Cliente clienteConcreto) {
        this.clienteConcreto = clienteConcreto;
    }

    @Override
    public Cliente getCliente() {
        return this.clienteConcreto;
    }
}
