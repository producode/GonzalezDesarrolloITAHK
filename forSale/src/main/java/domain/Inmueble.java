package domain;

import java.util.Date;

public class Inmueble {
    private double metrosCuadrados;
    private int cantidadAmbientes;
    private zona Zona;
    private Operacion operacion;

    public double plus(){
        return this.Zona.getPlus();
    }
    private void cambiarOperacion(Operacion unaOperacion){
        this.operacion = unaOperacion;
    }
    public void vender(double comision){
        Venta nuevaOperacion = new Venta();
        nuevaOperacion.inicializarOperacion();
        nuevaOperacion.setComision(comision);
        this.cambiarOperacion(nuevaOperacion);
    }
    public void alquilar(int meses){
        Alquiler nuevaOperacion = new Alquiler();
        nuevaOperacion.inicializarOperacion();
        nuevaOperacion.setMeses(meses);
        this.cambiarOperacion(nuevaOperacion);
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

    public int getCantidadAmbientes() {
        return cantidadAmbientes;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void cambiarReservar(Cliente unCliente, Empleado unEmpleado){
        this.operacion.reservarse(unCliente, unEmpleado, this);
    }
    public void cambiarConcretar(Cliente unCliente, Empleado unEmpleado){
        this.operacion.concretarse(unCliente, unEmpleado, this);
    }

    public double getComision(){
        return this.operacion.calcularComision(this);
    }

    public Date FechaCambioDeEstado(){
        return this.operacion.getFechaDeCambioDeEstado();
    }

    public zona getZona(){
        return this.Zona;
    }

    public boolean hayProblemasEntreEmpleados(){
        return this.operacion.problemasEntreEmpleados();
    }
}
