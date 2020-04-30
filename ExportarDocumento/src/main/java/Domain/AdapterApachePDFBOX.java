package Domain;

public class AdapterApachePDFBOX implements AdapterExportadosAPDF{
    public String exportarPDF(Exportable documento) {
        return "none";
    }
}
