package automovil;

public class AutoMovil {
    static private String color, marca, modelo;
    static private int caballosmotor;
        public AutoMovil(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
            System.out.println("Se ha creado un objeto de la clase AutoMovil de color "+ this.color+ ", De marca: "+ this.marca+" y es modelo: "+ this.modelo);
    }

        public AutoMovil(int caballosmotor) {
            this.caballosmotor=caballosmotor;
            System.out.println("Se ha creado un objeto de la clase Automovil que posee: "+this.caballosmotor+" Caballos de fuerza");
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
