package domain;

public class Tobara implements TipoDisfraz {
    @Override
    public int puntuarDisfraz(Invitado invitado, Fiesta fiesta) {
        long compraFecha = invitado.getFechaCompra().getTime();
        long usoFecha = fiesta.getFecha().getTime();
        long difTiempo = usoFecha - compraFecha;
        long difDias = difTiempo / (1000 * 60 * 60 * 24);
        if(difDias >= 2){
            return 5;
        }
        else {
            return 3;
        }
    }
}
