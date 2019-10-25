package domain;

public class Pretencioso implements TipoConformidad {
    @Override
    public boolean estaConforme(Invitado invitado, Fiesta fiesta) {
        long elaboracionFecha = invitado.getDisfraz().getFechaElaboracion().getTime();
        long usoFecha = fiesta.getFecha().getTime();
        long difTiempo = usoFecha - elaboracionFecha;
        long difDias = difTiempo / (1000 * 60 * 60 * 24);
        return difDias <= 30;
    }
}
