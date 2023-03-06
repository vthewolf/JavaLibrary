package poo.Empleado;

import java.util.Date;
import java.util.GregorianCalendar;

// En esta clase vamos a usar dos clases en el mismo fichero. 

public class Uso_Empleado {
    public static void main(String[] args) {
        
    }
    
}

class Empleado{

    private String nombre;
    private Double sueldo;
    private int year, mes, dia;
    private Date altaContrato;

    public Empleado(String nombre, double sueldo, int year, int mes, int dia){
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(year, mes - 1, dia);
        altaContrato = calendario.getTime();
    }

    public String getName(){
        return nombre;
    }

    public Double getSueldo(){
        return sueldo;
    }

    public Date getFechaContrato(){
        return altaContrato;
    }

    public void setSueldo(double porcentaje){
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }
}
