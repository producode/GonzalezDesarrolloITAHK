package domain;

import java.util.ArrayList;
import java.util.Date;

public class Empleado {
    private String nombre;
    private int DNI;
    private ArrayList<Inmueble> registro = new ArrayList<Inmueble>();
    public void reservarInmueble(Inmueble unInmueble, Cliente unCliente){
        unInmueble.cambiarReservar(unCliente,this);
    }
    public void concretarInmueble(Inmueble unInmueble, Cliente unCliente){
        unInmueble.cambiarConcretar(unCliente, this);
    }

    public ArrayList getRegistro() {
        return registro;
    }

    public double comisionesAnio(int anio){
        double totalDelAnio = 0;
        for (int a = 0;a < this.registro.size();a += 1){
            Date fecha = registro.get(a).FechaCambioDeEstado();
            if((fecha.getYear() + 1900) == anio){
                totalDelAnio = totalDelAnio + registro.get(a).getComision();
            }
        }
        return totalDelAnio;
    }

    public double totalComisiones(){
        double total = 0;
        for (int a = 0;a < this.registro.size();a += 1){
            Date fecha = registro.get(a).FechaCambioDeEstado();
            total = total + registro.get(a).getComision();
        }
        return total;
    }

    public void agregarRegistro(Inmueble unInmueble){
        Inmueble nuevoInmueble = unInmueble;
        registro.add(nuevoInmueble);
    }

    public void crearEmpleado(int DNI, String nombre){
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    private boolean cerrasteOperacionesEnLaMismaZona(Empleado otroEmpleado){
        ArrayList<zona> zonasMias = this.obtenerZonas();
        ArrayList<zona> zonasOtros = otroEmpleado.obtenerZonas();
        return zonasMias.stream().anyMatch(z -> zonasOtros.contains(z));
    }

    public ArrayList<zona> obtenerZonas(){
        ArrayList<zona> zonas = new ArrayList<zona>();
        registro.forEach(elInmueble -> zonas.add(elInmueble.getZona()));
        return zonas;
    }

    private boolean ReservaYConcretarPorDistintorEmpleados(){
        for(int a = 0;a < this.registro.size();a += 1){
            if(this.registro.get(a).hayProblemasEntreEmpleados()){
                return true;
            }
        }
        return false;
    }

    public boolean ProblemasConOtrosEmpleados(ArrayList<Empleado> otrosEmpleados){
        for(int a = 0;a < otrosEmpleados.size();a += 1){
            if (otrosEmpleados.get(a).getDNI() != this.DNI){
                if(this.cerrasteOperacionesEnLaMismaZona(otrosEmpleados.get(a)) || this.ReservaYConcretarPorDistintorEmpleados()) {
                    return true;
                }
            }
        }
        return false;
    }
}
