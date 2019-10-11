package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Tests {
    private Cliente cliente = new Cliente();
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();
    private ArrayList<zona> zonas = new ArrayList<zona>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    @Before
    public void init(){
        zona nuevaZona = new zona();
        //nueva zona
        nuevaZona.setZona(2000,"palermo");
        this.zonas.add(nuevaZona);
        //nuevo inmueble
        Departamento nuevoInmueble = new Departamento();
        nuevoInmueble.setInmueble(30,3,zonas.get(0));
        this.inmuebles.add(nuevoInmueble);
        //nuevo inmueble
        PH otroInmueble = new PH();
        otroInmueble.setInmueble(10,4,zonas.get(0));
        this.inmuebles.add(otroInmueble);
        //nuevo inmueble
        Galpon otroOtroInmueble = new Galpon();
        otroOtroInmueble.setInmueble(10,4,zonas.get(0));
        otroOtroInmueble.setValor(1000000);
        this.inmuebles.add(otroOtroInmueble);
        //nuevo inmueble
        Local otroOtroOtroInmueble = new Local();
        otroOtroOtroInmueble.setInmueble(10,4,zonas.get(0));
        otroOtroOtroInmueble.setValor(1000000);
        this.inmuebles.add(otroOtroOtroInmueble);
        //nuevo empleado
        Empleado nuevoEmpleado = new Empleado();
        nuevoEmpleado.crearEmpleado(42302270,"Lautaro Gonzalez");
        this.empleados.add(nuevoEmpleado);
        //nuevo empleado
        nuevoEmpleado = new Empleado();
        nuevoEmpleado.crearEmpleado(30227084,"Nicolas Jose Santos");
        this.empleados.add(nuevoEmpleado);
        //nuevo cliente
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.crearCliente(40402270,"Florencia Garay");
        clientes.add(nuevoCliente);
        //creacion de una venta
        this.inmuebles.get(0).vender(1);
        //creacion de un alquiler
        this.inmuebles.get(1).alquilar(4);
    }

    @Test
    public void solicitarComision(){
        this.cliente.SolicitarConcretar(inmuebles.get(0),empleados.get(0));
        Assert.assertEquals(10520,empleados.get(0).comisionesAnio(2019),0.1);
    }

    @Test
    public void mejorEmpleado(){
        Empleado THEBEST = empleados.get(0);
        Empleado THEONE = empleados.get(0);
        for(int a = 0;a < empleados.size();a += 1){
            if(THEBEST.totalComisiones() < empleados.get(a).totalComisiones()){
                THEBEST = empleados.get(a);
            }
            if(THEONE.getRegistro().size() < empleados.get(a).getRegistro().size()){
                THEONE = empleados.get(a);
            }
        }
        Assert.assertEquals(empleados.get(0),THEBEST);
        Assert.assertEquals(empleados.get(0),THEONE);
    }

    @Test
    public void hayProblemasPorZonas(){
        clientes.get(0).SolicitarConcretar(inmuebles.get(0),empleados.get(0));
        clientes.get(0).SolicitarConcretar(inmuebles.get(1),empleados.get(1));
        Assert.assertEquals(true,this.empleados.get(1).ProblemasConOtrosEmpleados(empleados));
    }

    @Test
    public void hayProblemasPorReserva(){
        clientes.get(0).SolicitarReserva(inmuebles.get(1),empleados.get(0));
        clientes.get(0).SolicitarConcretar(inmuebles.get(1),empleados.get(1));
        Assert.assertEquals(true,this.empleados.get(1).ProblemasConOtrosEmpleados(empleados));
    }

    @Test
    public void reservaCompraAlquiler(){
        clientes.get(0).SolicitarConcretar(inmuebles.get(1),empleados.get(1));
        clientes.get(0).SolicitarReserva(inmuebles.get(1),empleados.get(0));
        Assert.assertEquals(false, inmuebles.get(1).hayProblemasEntreEmpleados());
    }

    @Test
    public void usarLocales(){
        inmuebles.get(2).vender(1);
        inmuebles.get(2).alquilar(12);
        Assert.assertEquals(120.48,inmuebles.get(2).getComision(),0.1);
        inmuebles.get(3).vender(1);
        inmuebles.get(3).alquilar(12);
        Assert.assertEquals(240.48,inmuebles.get(3).getComision(),0.1);
    }
}
