package Domain.Robots;

import Domain.Estado;
import Domain.Ruta;

public class Clark extends Robot {
    private AdapterEnviarClark adapter;

    @Override
    public void buscarPaquete(Ruta ruta) {
        this.estado = Estado.OCUPADO;
        adapter.buscarPaquete(ruta);
        this.estado = Estado.LIBRE;
    }
}
