package automovil;


public class Main {
    public static void main(String[] args) {
        //Atributos
        System.out.println("------------------------------------------------------");
        AutoMovil mustang =new AutoMovil ("Gris","Ford Mustand","2013");
        AutoMovil mustang2 =new AutoMovil(420);



        //Metodos
        System.out.println("----------------------------------------");
        System.out.println(""); System.out.println("Las acciones que puede hacer este vehiculo son: ");
        System.out.println("----------------------------------------");
        mustang.Arrancar();
        System.out.println(mustang.Acelerar(83));
        System.out.println("Girar a la "+(mustang.Girar(1)+ " o a la " +(mustang.Girar(2))));
        mustang.Frenar();
        mustang.Reversar();

    }
}
