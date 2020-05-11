package domain.EstrategiasEjecucion;

import domain.AccionesEjecutables.Accion;
import domain.Tarea;

public class EjecucionParalela implements EstrategiaDeEjecucion {
    @Override
    public void ejecutar(Tarea tarea) {
        tarea.getAcciones().parallelStream().forEach(Accion::ejecutar);
    }
}
