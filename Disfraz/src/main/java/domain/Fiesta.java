package domain;

import java.util.Date;
import java.util.ArrayList;

public class Fiesta {
    private Date fecha;
    private String lugar;
    private ArrayList<Invitado> invitados = new ArrayList<Invitado>();

    public Date getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public ArrayList<Invitado> getInvitados() {
        return invitados;
    }

    public void setearFiesta(Date fecha, String lugar){
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public int determminarPuntajeDisfraz(Invitado invitado){
        return invitado.obtenerPuntajeDisfraz(this);
    }

    public boolean esUnBodrio(){
        return invitados.stream().allMatch(aburrido -> !aburrido.estaConformeLaPersona(this));
        //return invitados.stream().filter(aburrido -> aburrido.estaConformeLaPersona(this) == false).count() == invitados.size();
    }

    public Invitado elMejorDisfraz(){
        Invitado elMejor = invitados.get(0);
        for(int invitado = 0;invitado < invitados.size(); invitado += 1){
            if(invitados.get(invitado).obtenerPuntajeDisfraz(this) > elMejor.obtenerPuntajeDisfraz(this)){
                elMejor = invitados.get(invitado);
            }
        }
        return elMejor;
    }

    public boolean puedenCambiarTrajes(Invitado invitado1, Invitado invitado2){
        if(!invitado1.estaConformeLaPersona(this) || !invitado2.estaConformeLaPersona(this)){
            Disfraz disfraz1 = invitado1.getDisfraz();
            Disfraz disfraz2 = invitado2.getDisfraz();
            invitado1.setDisfraz(disfraz2);
            invitado2.setDisfraz(disfraz1);
            if(invitado1.estaConformeLaPersona(this) && invitado2.estaConformeLaPersona(this)){
                return true;
            }
            else {
                invitado1.setDisfraz(disfraz1);
                invitado2.setDisfraz(disfraz2);
                return false;
            }
        }
        else {
            return false;
        }
    }

    public boolean agregarInvitado(Invitado invitado){
        if(invitado.getDisfraz() != null && invitados.stream().filter(nuevoInvitado -> nuevoInvitado == invitado).count() == 0){
            invitados.add(invitado);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean laFisestaEsInolvidable(){
        boolean todosSonSexys = invitados.stream().filter(invitado -> invitado.getPersona().esSexy()).count() == invitados.size();
        boolean todosEstanConformes = invitados.stream().filter(invitado -> invitado.estaConformeLaPersona(this)).count() == invitados.size();
        return todosSonSexys && todosEstanConformes;
    }
}
