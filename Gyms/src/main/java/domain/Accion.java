package domain;

public class Accion {
    private Maquina maquina;

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public void ActivarMaquina(Regla regla){
        maquina.Activar(regla);
    }
}
