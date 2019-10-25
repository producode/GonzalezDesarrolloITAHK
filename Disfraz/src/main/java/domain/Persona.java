package domain;

public class Persona {
    private String nombre;
    private int edad;
    private Personalidad personalidad;
    private TipoConformidad conformidad;

    public boolean esSexy(){
        if(personalidad == Personalidad.Alegre){
            return false;
        }
        else if(personalidad == Personalidad.Taciturno && edad <= 30){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean estaConforme(Invitado invitado, Fiesta fiesta){
        return conformidad.estaConforme(invitado, fiesta);
    }

    public int getEdad() {
        return edad;
    }

    public void subirPersona(String nombre, int edad, Personalidad personalidad, TipoConformidad conformidad){
        this.nombre = nombre;
        this.edad = edad;
        this.personalidad = personalidad;
        this.conformidad = conformidad;
    }
}
