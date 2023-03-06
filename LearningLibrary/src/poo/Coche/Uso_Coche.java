package poo.Coche;

import javax.swing.*;

public class Uso_Coche {
    public static void main(String[] args) {
        Coche miCoche = new Coche(); // INSTANCIAR UNA CLASE

        miCoche.setColor(JOptionPane.showInputDialog("Introduce color"));

        System.out.println("Este coche tiene " + miCoche.getRuedas() + " ruedas");
        System.out.println("Este coche es de color " + miCoche.getColor());

        miCoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(miCoche.getAsientos_cuero());

    }
}
