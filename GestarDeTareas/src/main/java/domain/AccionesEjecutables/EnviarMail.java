package domain.AccionesEjecutables;

public class EnviarMail extends Accion{
    private AdapterEmailSender adapterEmailSender;

    public void setAdapterEmailSender(AdapterEmailSender adapterEmailSender) {
        this.adapterEmailSender = adapterEmailSender;
    }

    public AdapterEmailSender getAdapterEmailSender() {
        return adapterEmailSender;
    }
}
