package automovil;


public class Main {
    public static void main(String[] args) {
        AutoMovil mustang =new AutoMovil ();
        System.out.println("----------------------------------------");
        System.out.println(""); System.out.println("Las acciones que puede hacer este vehiculo son: ");
        System.out.println("----------------------------------------");
        mustang.Arrancar();
        System.out.println(mustang.Acelerar(83));
        System.out.println("Girar a la "+(mustang.Girar(1)+ " o a la " +(mustang.Girar(2))));
        mustang.Frenar();
        mustang.Reversar();


        //Atributos
        System.out.println("");
        System.out.println("Las caracteristicas del vehiculo son: ");
        System.out.println("-------------------------------------");
        System.out.println(mustang.color());
        System.out.println(mustang.marca());
        System.out.println(mustang.modelo());
        System.out.println("El vehiculo tiene "+((int)mustang.caballosmotor())+" Caballos de fuerza");
        System.out.println("-------------------------------------");
    }

    }
