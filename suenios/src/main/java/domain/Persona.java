package domain;

import java.util.ArrayList;

public class Persona {
    private int edad = 0;
    private String nombre = "";
    private int felicidonios = 0;
    private int felicidad = 0;
    private Suenio suenioMasImportante;
    private ArrayList<Suenio> sueniosCumplidos = new ArrayList<Suenio>();
    private ArrayList<Suenio> sueniosPendientes = new ArrayList<Suenio>();
    private ArrayList<String> viajes = new ArrayList<String>();
    private ArrayList<Hijos> hijos = new ArrayList<Hijos>();
    private double sueldo = 0;
    private ArrayList<String> carreras = new ArrayList<String>();
    private ArrayList<String> carrerasDeseadas = new ArrayList<String>();
    private TiposPersonas tipoPersona;

    public void setDatos(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void setTipoPersona(TiposPersonas tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public void cumplirSueniosPendientesSegunElTipo(){
        this.tipoPersona.cumplirSueniosPendientes(this);
    }

    public void setSuenioMasImportante(Suenio suenioMasImportante) {
        this.suenioMasImportante = suenioMasImportante;
    }

    public Suenio getSuenioMasImportante() {
        return suenioMasImportante;
    }

    public boolean estaCumplido(Suenio nuevoSuenio) {
        return sueniosCumplidos.stream().filter(suenio -> suenio == nuevoSuenio).count() >= 1;
    }

    public void agregarSuenio(Suenio nuevoSuenio){
        nuevoSuenio.cumplirSuenio(this);
        if(this.tieneYaElSuenioEnPendientes(nuevoSuenio)){
            this.pasarSuenioPendienteACumplido(nuevoSuenio);
        }
        else {
            this.agregarSuenioCumplido(nuevoSuenio);
        }
    }

    public void agregarSuenioCumplido(Suenio nuevoSuenio){
        sueniosCumplidos.add(nuevoSuenio);
    }

    public void agregarSuenioPendiente(Suenio nuevoSuenio){
        sueniosPendientes.add(nuevoSuenio);
    }

    public void pasarSuenioPendienteACumplido(Suenio nuevoSuenio){
        for(int a = 0; a < sueniosPendientes.size();a = a + 1){
            if(sueniosPendientes.get(a) == nuevoSuenio) {
                sueniosPendientes.remove(a);
                break;
            }
        }
        sueniosCumplidos.add(nuevoSuenio);
    }

    public boolean tieneYaElSuenioEnPendientes(Suenio nuevoSuenio){
        return sueniosPendientes.contains(nuevoSuenio);
    }

    public void agregarFelicidonios(int felicidonios) {
        this.felicidonios = this.felicidonios + felicidonios;
    }
    public boolean sosFeliz(){
        return (this.felicidad > this.felicidonios);
    }

    public boolean sosAmbiosioso(){
        long sueniosCumplidosMayorACienFelicidonios= this.sueniosCumplidos.stream().filter(suenio -> suenio.getRecompensa() >= 100).count();
        long sueniosPendientesMayorACienFelicidonios = this.sueniosPendientes.stream().filter(suenio -> suenio.getRecompensa() >= 100).count();
        return ((sueniosCumplidosMayorACienFelicidonios + sueniosPendientesMayorACienFelicidonios ) >= 3);
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public void agregarHijos(Hijos hijo) {
        this.hijos.add(hijo);
    }

    public ArrayList<Hijos> getHijos() {
        return hijos;
    }

    public void agregarCarreras(String carrera) {
        if(puedeAgregarCarrera(carrera)){
            this.carreras.add(carrera);
        }
    }

    public void agregarCarrerasDeseadas(String carrera){
        this.carrerasDeseadas.add(carrera);
    }

    public boolean puedeAgregarCarrera(String carrera){
        boolean prueba = (this.carreras.contains(carrera) == false || this.carreras.size() == 0);
        return prueba;
    }

    public boolean quiereEstudiarLaCarrera(String carrera){
        return this.carrerasDeseadas.contains(carrera);
    }

    public void agregarViaje(String viaje){
        if(puedeAgregarViaje(viaje)){
            this.viajes.add(viaje);
        }
    }

    public boolean puedeAgregarViaje(String viaje){
        return (this.viajes.contains(viaje) == false);
    }



    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getFelicidonios() {
        return felicidonios;
    }

    public ArrayList<String> getCarreras() {
        return carreras;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getViajes() {
        return viajes;
    }

    public ArrayList<Suenio> getSueniosCumplidos() {
        return sueniosCumplidos;
    }

    public ArrayList<Suenio> getSueniosPendientes() {
        return sueniosPendientes;
    }

    public ArrayList<String> getCarrerasDeseadas() {
        return carrerasDeseadas;
    }

    public int getEdad() {
        return edad;
    }

    public int getFelicidad() {
        return felicidad;
    }
}
