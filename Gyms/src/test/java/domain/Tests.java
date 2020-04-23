package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
<<<<<<< HEAD

=======
import java.util.List;
>>>>>>> ce453b77b7c038611d4753fbb9d6903f2a1d77e0


public class Tests {
    private int nada = 0;
<<<<<<< HEAD
    @Test
    public void agregarPersona(){
        Assert.assertEquals(true, true);
=======
    private List<Regla> reglas = new ArrayList<Regla>();
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    @Before
    public void init() {
        //Crear reglas
        Regla nuevaRegla = new Regla(1, "Mantener a 18C", "mantiene la temperatura de la pileta 1 a 18 grados centigrados");
        reglas.add(nuevaRegla.getAll());
        nuevaRegla = new Regla(2, "Mantener a 20C", "Mantiene la pileta 2 a 20 grados centigrados");
        reglas.add(nuevaRegla.getAll());

        //Crear usuarios
        Usuario nuevoUsuario = new Usuario(42302270,"Gonzalez, Lautaro Nahuel",1163320770,"produgraf2000@gmail.com");
        usuarios.add(nuevoUsuario.getAll());
    }

    @Test
    public void crearRegla() {
        Assert.assertNotEquals(reglas.get(0).getId(), reglas.get(1).getId());
        Assert.assertEquals(reglas.get(0).getId(),1);
        Assert.assertEquals(reglas.get(0).getNombre(),"Mantener a 18C");
        Assert.assertEquals(reglas.get(0).getDescripcion(),"mantiene la temperatura de la pileta 1 a 18 grados centigrados");
>>>>>>> ce453b77b7c038611d4753fbb9d6903f2a1d77e0
    }
}
