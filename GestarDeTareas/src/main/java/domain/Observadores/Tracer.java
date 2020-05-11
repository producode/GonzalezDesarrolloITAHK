package domain.Observadores;

public abstract class Tracer implements IObserver {
    private String nombreDelArchivo;
    private String ruta;

    public String getNombreDelArchivo() {
        return nombreDelArchivo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setNombreDelArchivo(String nombreDelArchivo) {
        this.nombreDelArchivo = nombreDelArchivo;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
