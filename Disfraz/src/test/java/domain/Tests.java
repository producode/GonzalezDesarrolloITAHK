package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class Tests {
    private ArrayList<Invitado> invitados = new ArrayList<Invitado>();
    private ArrayList<Fiesta> fiestas = new ArrayList<Fiesta>();
    @Before
    public void init(){
        Pretencioso TipoPretenciosos = new Pretencioso();
        Caprichoso TipoCaprichoso = new Caprichoso();

        Sexy tipoSexy = new Sexy();
        Tobara tipoToba = new Tobara();

        Persona nuevaPersona = new Persona();
        Disfraz nuevoDisfraz = new Disfraz();
        Invitado nuevoInvitado = new Invitado();
        Fiesta nuevaFiesta = new Fiesta();

        nuevaFiesta.setearFiesta( new Date(2019,10,4), "Porto");
        fiestas.add(nuevaFiesta);

        nuevaPersona.subirPersona("Lautaro Gonzalez", 19, Personalidad.Taciturno, TipoPretenciosos);
        nuevoDisfraz.ingresarDisfraz("politico de turno", new Date(2019, 9, 30));
        nuevoDisfraz.agregarTipo(tipoSexy);
        nuevoDisfraz.agregarTipo(tipoToba);
        nuevoInvitado.setDisfraz(nuevoDisfraz);
        nuevoInvitado.setPersona(nuevaPersona);
        nuevoInvitado.setFechaCompra(new Date(2019,10,2));
        invitados.add(nuevoInvitado);

        Persona nuevaPersona2 = new Persona();
        Disfraz nuevoDisfraz2 = new Disfraz();
        Invitado nuevoInvitado2 = new Invitado();

        nuevaPersona2.subirPersona("Nicolas Santos", 19, Personalidad.Taciturno, TipoCaprichoso);
        nuevoDisfraz2.ingresarDisfraz("CJ", new Date(2019, 9, 21));
        nuevoDisfraz2.agregarTipo(tipoToba);
        nuevoDisfraz2.agregarTipo(tipoSexy);
        nuevoInvitado2.setDisfraz(nuevoDisfraz2);
        nuevoInvitado2.setPersona(nuevaPersona2);
        nuevoInvitado2.setFechaCompra(new Date(2019,10,3));
        invitados.add(nuevoInvitado2);

        Persona nuevaPersona3 = new Persona();
        Disfraz nuevoDisfraz3 = new Disfraz();
        Invitado nuevoInvitado3 = new Invitado();

        nuevaPersona3.subirPersona("Martina", 19, Personalidad.Alegre, TipoCaprichoso);
        nuevoDisfraz3.ingresarDisfraz("TeletubiR", new Date(2019, 9, 21));
        nuevoDisfraz3.agregarTipo(tipoToba);
        nuevoDisfraz3.agregarTipo(tipoSexy);
        nuevoInvitado3.setDisfraz(nuevoDisfraz3);
        nuevoInvitado3.setPersona(nuevaPersona3);
        nuevoInvitado3.setFechaCompra(new Date(2019,10,3));
        invitados.add(nuevoInvitado3);
    }

    @Test
    public void agregarPersona(){
        Assert.assertEquals(true, fiestas.get(0).agregarInvitado(invitados.get(0)));
        Assert.assertEquals(false, fiestas.get(0).agregarInvitado(invitados.get(0)));
    }

    @Test
    public void determinarPuntajeDisfraz(){
        fiestas.get(0).agregarInvitado(invitados.get(0));
        Assert.assertEquals(20,fiestas.get(0).determminarPuntajeDisfraz(invitados.get(0)));
        fiestas.get(0).agregarInvitado(invitados.get(1));
        Assert.assertEquals(18, fiestas.get(0).determminarPuntajeDisfraz(invitados.get(1)));
    }

    @Test
    public void esUnBodrio(){
        fiestas.get(0).agregarInvitado(invitados.get(0));
        fiestas.get(0).agregarInvitado(invitados.get(1));
        Assert.assertEquals(false,fiestas.get(0).esUnBodrio());
        //fiestas.get(0).agregarInvitado(invitados.get(2));
        //Assert.assertTrue(fiestas.get(0).esUnBodrio());
    }
}
