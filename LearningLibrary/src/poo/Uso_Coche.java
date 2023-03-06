package poo;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche miCoche = new Coche(); // INSTANCIAR UNA CLASE

        miCoche.setColor("Azul");
        System.out.println("Este coche tiene " + miCoche.getRuedas() + " ruedas");
        System.out.println("Este coche es de color " + miCoche.getColor());

        miCoche.configuraAsientos("si");
        System.out.println(miCoche.getAsientos_cuero());

    }
}
