package poo;
public class Coche{
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;

    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }
    
    public int getRuedas() {
        return ruedas;
    }
    public int getLargo() {
        return largo;
    }
    public int getAncho() {
        return ancho;
    }
    public int getMotor() {
        return motor;
    }
    public int getPeso() {
        return peso;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public void setMotor(int motor) {
        this.motor = motor;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
}