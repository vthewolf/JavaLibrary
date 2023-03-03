package poo;
public class Coche{
    // Propiedades comunes
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    
    // Propiedades que pueden variar
    String color;
    int peso_total;
    boolean asientos_cuero, climatizador;

    
    // Constructor con los valores que nunca cambian
    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }
    

    public int getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return this.largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return this.ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return this.motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso_plataforma() {
        return this.peso_plataforma;
    }

    public void setPeso_plataforma(int peso) {
        this.peso_plataforma = peso;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso_total() {
        return this.peso_total;
    }

    public void setPeso_total(int peso_total) {
        this.peso_total = peso_total;
    }

    public boolean isAsientos_cuero() {
        return this.asientos_cuero;
    }

    public boolean getAsientos_cuero() {
        return this.asientos_cuero;
    }

    public void setAsientos_cuero(boolean asientos_cuero) {
        this.asientos_cuero = asientos_cuero;
    }

    public boolean isClimatizador() {
        return this.climatizador;
    }

    public boolean getClimatizador() {
        return this.climatizador;
    }

    public void setClimatizador(boolean climatizador) {
        this.climatizador = climatizador;
    }
    
}