package domain;

import java.util.Date;

public class Invitado {
    private Persona persona;
    private Disfraz disfraz;
    private Date fechaCompra;

    public Persona getPersona() {
        return persona;
    }

    public Disfraz getDisfraz() {
        return disfraz;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setDisfraz(Disfraz disfraz) {
        this.disfraz = disfraz;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int obtenerPuntajeDisfraz(Fiesta fiesta){
        return this.disfraz.puntuacionTotal(this, fiesta);
    }

    public boolean estaConformeLaPersona(Fiesta fiesta){
        return this.persona.estaConforme(this,fiesta);
    }
}
