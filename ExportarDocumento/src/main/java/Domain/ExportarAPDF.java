package Domain;

public class ExportarAPDF implements EstrategiaDeExportacion{
    private AdapterExportadosAPDF adapter;

    public String exportar(Exportable documento) {
        return adapter.exportarPDF(documento);
    }
}
