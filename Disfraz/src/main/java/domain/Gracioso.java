package domain;

public class Gracioso implements TipoDisfraz {
    private int nivelDeGracia = 0;

    @Override
    public int puntuarDisfraz(Invitado invitado, Fiesta fiesta) {
        int gracia = this.nivelDeGracia;
        if(invitado.getPersona().getEdad() >= 50){
            gracia = gracia*3;
        }
        return gracia;
    }

    public void setNivelDeGracia(int nivelDeGracia) {
        this.nivelDeGracia = nivelDeGracia;
    }

    public int getNivelDeGracia() {
        return nivelDeGracia;
    }
}
