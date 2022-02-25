package automovil;

public class AutoMovil {
    static public String color, marca, modelo;
    static public int caballosmotor;

            String color() {
                return "El color del vehiculo es: Gris";
            }

            String marca() {
                return "La marca del vehiculo es: Ford Mustang";
            }

            String modelo() {
                return "El modelo del vehiculo es: Ford Mustang GT 2013";
            }

            int caballosmotor() {
                return caballosmotor=420;
            }

            void Arrancar() {
                System.out.println("Encender");
            }
            String Acelerar(int km) {
                km*=3; // Km es igual a lo que tiene km por 3 (km=km*3)
                return "Puede ir a "+ km +" km por hora";
            }
            String Girar(int direccion) {
                return direccion==1?"Derecha":"Izquierda";
            }
            void Frenar() {
                System.out.println("Reducir su velocidad");
            }
            void Reversar() {
                System.out.println("Retroceder");
            }
}
