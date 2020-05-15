package Domain.Robots;

import Domain.Estado;
import Domain.Ruta;

public class Drone extends Robot {
    private AdapterEnviarDrone adapter;

    @Override
    public void buscarPaquete(Ruta ruta) {
        this.estado = Estado.OCUPADO;
        adapter.buscarPaquete(ruta);
        this.estado = Estado.LIBRE;
    }
}
