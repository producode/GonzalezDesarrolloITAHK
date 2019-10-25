package domain;

public class Numerologo implements TipoConformidad{
    private int numeroPrincipal;

    @Override
    public boolean estaConforme(Invitado invitado, Fiesta fiesta) {
        return invitado.getDisfraz().puntuacionTotal(invitado,fiesta) == this.numeroPrincipal;
    }
}
