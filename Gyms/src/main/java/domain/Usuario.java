package domain;

<<<<<<< HEAD
=======
import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.List;

>>>>>>> ce453b77b7c038611d4753fbb9d6903f2a1d77e0
public class Usuario {
    private int dni = 0;
    private String nombre = "";
    private int telefono = 0;
    private String email = "";

<<<<<<< HEAD
=======
    public Usuario(){
        this.dni = 0;
        this.nombre = "";
        this.telefono = 0;
        this.email = "";
    }

    public Usuario(int dni,String nombre,int telefono,String email){
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Usuario getAll(){
        return this;
    }

>>>>>>> ce453b77b7c038611d4753fbb9d6903f2a1d77e0
    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void AvisarUsuario(Regla reglaAEnviar) {

        avisar(reglaAEnviar.getNombre(), reglaAEnviar.getDescripcion());
    }

    private void avisar(String nombreAlerta, String descripcionAlerta){
        //envia nombre y descripcion al telefono y mail
    }
<<<<<<< HEAD
=======


>>>>>>> ce453b77b7c038611d4753fbb9d6903f2a1d77e0
}
