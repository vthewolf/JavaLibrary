package poo;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche Renault = new Coche(); // INSTANCIAR UNA CLASE

        Renault.setColor("Azul");
        System.out.println("Este coche tiene " + Renault.getRuedas() + " ruedas");
        System.out.println("Este coche es de color " + Renault.getColor());

    }
}
