package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Daniel", 35);
        System.out.println("Detalles de la persona:");
        persona.mostrarDetalles();

        System.out.println();

       
        Empleado empleado = new Empleado("Zoila", 28, "Recursos Humanos");
        System.out.println("Detalles del empleado:");
        empleado.mostrarDetalles();
    }
}

