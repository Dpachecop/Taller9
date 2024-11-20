package Ejercicio2;

public class Pez extends Animal {
    private String tipoDeAgua; 

   
    public Pez(String especie, String tipoDeAgua) {
        super(especie); 
    }

  
    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); 
        System.out.println("Tipo de Agua: " + tipoDeAgua);
    }
}

