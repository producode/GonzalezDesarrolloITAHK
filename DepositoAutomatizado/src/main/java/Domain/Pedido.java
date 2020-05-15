package Domain;

import java.util.ArrayList;

public class Pedido <T> implements IObservable{
    private ArrayList<T> mercaderiasPedidas;
    private Cliente cliente;
    private Transportista transportista;

    public void notificar() {
        cliente.serNotificadoPor(this);
        transportista.serNotificadoPor(this);
    }
}
