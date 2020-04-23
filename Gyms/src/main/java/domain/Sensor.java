package domain;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private int Id = 0;
    private String Nombre = "";
    private String Lugar = "";
    private List<ValorHistorico> ValoresHistoricos = new ArrayList<ValorHistorico>();
    private String UnidadDeMedicion = "";

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getLugar() {
        return Lugar;
    }

    public String getUnidadDeMedicion() {
        return UnidadDeMedicion;
    }

    public List<ValorHistorico> getValoresHistoricos() {
        return ValoresHistoricos;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public void setUnidadDeMedicion(String unidadDeMedicion) {
        UnidadDeMedicion = unidadDeMedicion;
    }

    public void ActualizarValor(ValorHistorico NuevoValorHistorico) {
        ValoresHistoricos.add(NuevoValorHistorico);
    }

    public int getDatosSensor() {
        return ValoresHistoricos.get(ValoresHistoricos.size() - 1).getValor();
    }
}
