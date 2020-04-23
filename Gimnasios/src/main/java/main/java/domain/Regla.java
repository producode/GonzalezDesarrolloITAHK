package main.java.domain;

import java.util.ArrayList;
import java.util.List;

public class Regla {
    private int id = 0;
    private String nombre = "";
    private String descripcion = "";
    private List<Limite> limites = new ArrayList<Limite>();
    private List<Accion> acciones = new ArrayList<Accion>();
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Limite> getLimites() {
        return limites;
    }

    public List<Accion> getAcciones() {
        return acciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarLimite(Limite nuevoLimite){
        this.limites.add(nuevoLimite);
    }

    public void agregarAccion(Accion nuevaAccion){
        this.acciones.add(nuevaAccion);
    }

    public void agregarUsuario(Usuario nuevoUsuario){
        this.usuarios.add(nuevoUsuario);
    }

    public void quitarLimite(Limite limiteEliminar){
        this.limites.remove(limiteEliminar);
    }

    public void quitarAccion(Accion accionEliminar){
        this.acciones.remove(accionEliminar);
    }

    public void quitarUsuario(Usuario usuarioEliminar){
        this.usuarios.remove(usuarioEliminar);
    }




    public void verificarLimiter(){
        if(this.limites.stream().filter(z -> z.superaElLimite()).count() == this.limites.size()){
            ejecutarAccion();
            avisarUsuarios();
        }
    }

    private void ejecutarAccion(){
        for(int a = 0;a < this.acciones.size();a = a + 1){
            this.acciones.get(a).ActivarMaquina(this);
        }
    }

    private void avisarUsuarios(){
        for(int a = 0;a < this.usuarios.size();a = a + 1){
            this.usuarios.get(a).AvisarUsuario(this);
        }
    }

}
