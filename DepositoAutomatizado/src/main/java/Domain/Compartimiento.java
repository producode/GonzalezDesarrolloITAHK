package Domain;

import java.util.ArrayList;

public class Compartimiento <T>{
    private ArrayList<Integer> PosicionXYZ;
    private T mercaderia;

    public void setMercaderia(T mercaderia) {
        this.mercaderia = mercaderia;
    }

    public void setPosicionXYZ(ArrayList<Integer> posicionXYZ) {
        PosicionXYZ = posicionXYZ;
    }

    public T getMercaderia() {
        return mercaderia;
    }

    public ArrayList<Integer> getPosicionXYZ() {
        return PosicionXYZ;
    }
}
