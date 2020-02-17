package main.java.domain;

import java.util.ArrayList;

public class Limite {
    private Sensor sensor = null;
    private int valorLimite = 0;
    private boolean sentidoLimite = true;

    public Sensor getSensor() {
        return sensor;
    }

    public int getValorLimite() {
        return valorLimite;
    }

    public boolean isSentidoLimite() {
        return sentidoLimite;
    }

    public void setSentidoLimite(boolean sentidoLimite) {
        this.sentidoLimite = sentidoLimite;
    }

    public void setValorLimite(int valorLimite) {
        this.valorLimite = valorLimite;
    }

    public boolean superaElLimite(){
        if(sentidoLimite){
            return this.valorLimite <= this.sensor.getDatosSensor();
        }
        return this.valorLimite >= this.sensor.getDatosSensor();
    }

    public int verificarValor(){
        return this.sensor.getDatosSensor();
    }
}
