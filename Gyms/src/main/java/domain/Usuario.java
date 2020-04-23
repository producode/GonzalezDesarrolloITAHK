package domain;

public class Usuario {
    private int dni = 0;
    private String nombre = "";
    private int telefono = 0;
    private String email = "";

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
}
