package Domain;

public class Exportador {
    private Exportable documentoAExportar;
    private EstrategiaDeExportacion estrategia;

    public String exportar(){
        return estrategia.exportar(documentoAExportar);
    };

    public void cambiarEstrategia(EstrategiaDeExportacion estrategia){
        this.estrategia = estrategia;
    }

    public void setDocumentoAExportar(Exportable documentoAExportar) {
        this.documentoAExportar = documentoAExportar;
    }
}
