package domain;

public class Caprichoso implements TipoConformidad {
    @Override
    public boolean estaConforme(Invitado invitado, Fiesta fiesta) {
        return (invitado.getDisfraz().getNombre().length() % 2) == 0;
    }
}
