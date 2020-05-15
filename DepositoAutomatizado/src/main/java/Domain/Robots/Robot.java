package Domain.Robots;

import Domain.Estado;
import Domain.Ruta;

public abstract class Robot {
    protected Estado estado;

    public Robot(){
        this.estado = Estado.LIBRE;
    }

    public Estado getEstado() {
        return estado;
    }

    public void buscarPaquete(Ruta ruta){

    }
}
