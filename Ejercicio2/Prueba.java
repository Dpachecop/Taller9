package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
       
        Animal animal = new Animal("Felino");
        System.out.println("Detalles del animal:");
        animal.mostrarEspecie();

        System.out.println();

        
        Pez pez = new Pez("Tilapia", "Agua Dulce");
        System.out.println("Detalles del pez:");
        pez.mostrarEspecie();
    }
}
