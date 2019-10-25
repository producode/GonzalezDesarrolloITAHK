package domain;

import java.util.ArrayList;
import java.util.Date;

public class Disfraz {
    private String nombre;
    private Date fechaElaboracion;
    private ArrayList<TipoDisfraz> tipos = new ArrayList<TipoDisfraz>();

    public int puntuacionTotal(Invitado invitado, Fiesta fiesta){
        int acumulador = 0;
        for(int tipo = 0; tipo < tipos.size(); tipo += 1 ){
            acumulador += tipos.get(tipo).puntuarDisfraz(invitado,fiesta);
        }
        return acumulador;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaElaboracion() {
        return fechaElaboracion;
    }

    public ArrayList<TipoDisfraz> getTipos() {
        return tipos;
    }

    public void ingresarDisfraz(String nombre, Date fechaElaboracion){
        this.nombre = nombre;
        this.fechaElaboracion = fechaElaboracion;
    }

    public void agregarTipo(TipoDisfraz tipoDisfraz){
        if(this.tipos.stream().filter(tipo -> tipo == tipoDisfraz).count() == 0){
            tipos.add(tipoDisfraz);
        }
    }
}
