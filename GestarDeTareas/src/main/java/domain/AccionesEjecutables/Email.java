package domain.AccionesEjecutables;

public class Email {
    private String destinatario;
    private String remitente;
    private String lector;

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getLector() {
        return lector;
    }
}
