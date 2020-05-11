package domain.AccionesEjecutables;

import java.io.IOException;

public class AbrirAplicacion extends Accion {
    public AbrirAplicacion(String ruta) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        Process process = runtime.exec(ruta);
    }
}
