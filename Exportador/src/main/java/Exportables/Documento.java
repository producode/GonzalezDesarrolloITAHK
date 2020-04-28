package Exportables;

import java.util.*;

public class Documento implements Exportable {
    private  Map<String,List<String>> datos;

    public Documento(){
        this.datos = new HashMap<String, List<String>>();
    }

    public Map<String, List<String>> datos() {
        return this.datos;
    }

    public void agregarDato(String clave, String ... valor){
        this.agregarClaseSiNoExiste(clave);
        Collections.addAll(this.datos.get(clave),valor);

    }

    private void agregarClaseSiNoExiste(String clave){
        if (!this.datos.containsKey(clave)){
            this.datos.put(clave, new ArrayList<String>());
        }
    }
}
