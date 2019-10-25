package domain;

public class Sexy implements TipoDisfraz {

    @Override
    public int puntuarDisfraz(Invitado invitado, Fiesta fiesta) {
        if(invitado.getPersona().esSexy()){
            return 15;
        }
        else {
            return 2;
        }
    }
}
