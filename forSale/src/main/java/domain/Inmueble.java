package domain;

public class Inmueble {
    private double metrosCuadrados;
    private int cantidadAmbientes;
    private zona Zona;
    private Operacion operacion;

    public double plus(){
        return this.Zona.getPlus();
    }
    public void cambiarOperacion(Operacion unaOperacion){
        this.operacion = unaOperacion;
    }
    public double calcularValorInmueble(){
        return 0;
    }
    public double getValorNeto(){
        return plus() + calcularValorInmueble();
    }
    public void setInmueble(double MetrosCuadrados, int CantidadAmbientes, zona nuevaZona){
        this.metrosCuadrados = MetrosCuadrados;
        this.cantidadAmbientes = CantidadAmbientes;
        this.Zona = nuevaZona;
    }
    public void cambiarReservar(Cliente unCliente, Empleado unEmpleado){
        this.operacion.reservarse(unCliente, unEmpleado, this);
    }
    public void cambiarConcretar(Cliente unCliente, Empleado unEmpleado){
        this.operacion.concretarse(unCliente, unEmpleado, this);
    }
}
