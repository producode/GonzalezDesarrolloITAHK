package Domain;

import java.util.List;
import java.util.Map;

public class Documento implements Ruta{
    private Map<String, List<String>> datos;

    public Map<String, List<String>> datos() {
        return this.datos;
    }

    public void setDatos(Map<String, List<String>> datos) {
        this.datos = datos;
    }
}
