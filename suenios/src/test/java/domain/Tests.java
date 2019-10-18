package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Tests {
    private ArrayList<Persona> personas = new ArrayList<Persona>();
    private ArrayList<Suenio> sueniosLista = new ArrayList<Suenio>();

    @Before
    public void init(){
        Persona nuevaPersona = new Persona();
        nuevaPersona.setDatos(20,"Lautaro Gonzalez");
        nuevaPersona.setFelicidad(150);
        nuevaPersona.agregarCarrerasDeseadas("Ingenieria en Sistemas");
        nuevaPersona.setSueldo(10000);
        Realista tipoNuevo = new Realista();
        nuevaPersona.setTipoPersona(tipoNuevo);
        personas.add(nuevaPersona);

        //sueños
        //sueldo de mas de 9000
        Sueldo nuevoSuenio = new Sueldo();
        nuevoSuenio.setRecompensa(100);
        nuevoSuenio.setSueldoDeseado(9000);
        sueniosLista.add(nuevoSuenio);
        //carrera Ingenieria en sistemas
        Carrera nuevoSuenio2 = new Carrera();
        nuevoSuenio2.setRecompensa(100);
        nuevoSuenio2.setCarrera("Ingenieria en Sistemas");
        sueniosLista.add(nuevoSuenio2);
        //carrera abogado
        Carrera nuevoSuenio3 = new Carrera();
        nuevoSuenio3.setRecompensa(100);
        nuevoSuenio3.setCarrera("abogacia");
        sueniosLista.add(nuevoSuenio3);
        //carrera economista
        Carrera nuevoSuenio4 = new Carrera();
        nuevoSuenio4.setRecompensa(100);
        nuevoSuenio4.setCarrera("economista");
        sueniosLista.add(nuevoSuenio3);
    }

    @Test
    public void cumplirSuenios(){
        personas.get(0).agregarSuenio(sueniosLista.get(0));
        Assert.assertEquals(100,personas.get(0).getFelicidonios());
        personas.get(0).agregarSuenio(sueniosLista.get(1));
        try {
            personas.get(0).agregarSuenio(sueniosLista.get(2));
        }finally {

        };
        Assert.assertEquals(200,personas.get(0).getFelicidonios());
    }

    @Test
    public void cumplirMultiSuenios(){
        MultiSuenio multiSuenioPrueba = new MultiSuenio();
        multiSuenioPrueba.setRecompensa(100);
        multiSuenioPrueba.agregarSuenios(sueniosLista.get(0));
        multiSuenioPrueba.agregarSuenios(sueniosLista.get(1));
        personas.get(0).agregarSuenio(multiSuenioPrueba);
        Assert.assertEquals(200, personas.get(0).getFelicidonios());
    }

    @Test
    public void probarTiposDePersonas(){
        personas.get(0).setSuenioMasImportante(sueniosLista.get(2));
        personas.get(0).agregarSuenio(sueniosLista.get(2));
        personas.get(0).agregarSuenio(sueniosLista.get(3));
        Assert.assertEquals(0,personas.get(0).getFelicidonios());
        personas.get(0).cumplirSueniosPendientesSegunElTipo();
        Assert.assertEquals(0,personas.get(0).getFelicidonios());
        personas.get(0).agregarCarrerasDeseadas("economista");
        personas.get(0).cumplirSueniosPendientesSegunElTipo();
        Assert.assertEquals(0,personas.get(0).getFelicidonios());
        personas.get(0).agregarCarrerasDeseadas("abogacia");
        personas.get(0).cumplirSueniosPendientesSegunElTipo();
        Assert.assertEquals(100,personas.get(0).getFelicidonios());
    }

    @Test
    public void esFeliz(){
        personas.get(0).agregarSuenio(sueniosLista.get(0));
        Assert.assertEquals(true,personas.get(0).sosFeliz());
        personas.get(0).agregarSuenio(sueniosLista.get(1));
        Assert.assertEquals(false,personas.get(0).sosFeliz());
    }

    @Test
    public void esAmbisioso(){
        personas.get(0).agregarSuenio(sueniosLista.get(0));
        Assert.assertEquals(false,personas.get(0).sosAmbiosioso());
        personas.get(0).agregarSuenio(sueniosLista.get(1));
        Assert.assertEquals(false,personas.get(0).sosAmbiosioso());
        personas.get(0).agregarSuenio(sueniosLista.get(2));
        Assert.assertEquals(true,personas.get(0).sosAmbiosioso());
    }
}
