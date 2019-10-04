package domain;

public interface EstadoOperacion {
    void reservar(Cliente unCliente, Empleado unEmpleado, Operacion miOperacion);
    void concretar(Cliente unCliente, Empleado unEmpleado, Operacion miOperacion);
    Cliente getCliente();
}
