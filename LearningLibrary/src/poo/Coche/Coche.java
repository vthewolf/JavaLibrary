package poo.Coche;
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

    public String getAsientos_cuero() {
        if (asientos_cuero){
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientos de serie.";
        }
    }

    public boolean isClimatizador() {
        return this.climatizador;
    }

    public String getClimatizador() {
        if (climatizador) {    
            return "El coche incorpora climatizador";
            } else {
            return "El coche lleva aire acondicionado";
        }
    }

    public void configuraClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public void configuraAsientos(String asientosCuero){
        if (asientosCuero.equalsIgnoreCase("si")){
            this.asientos_cuero = true;
        }else {
            this.asientos_cuero = false;
        }
    }
    
}