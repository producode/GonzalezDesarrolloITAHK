package domain.EstrategiasEjecucion;

import domain.AccionesEjecutables.Accion;
import domain.Tarea;

public class EjecucionSecuencial implements EstrategiaDeEjecucion{
    @Override
    public void ejecutar(Tarea tarea) {
        tarea.getAcciones().forEach(Accion::ejecutar);
    }
}
