package Uso_incorrecto;

public class ClaseDerivada extends ClaseBase {
    public void mostrarAtributoPrivado() {

        // Intento acceder al atributo privado usando super
        // System.out.println(super.atributoPrivado); // Error de compilación: no se puede acceder al atributo privado

        // Acceso al atributo privado mediante un método público
        System.out.println("Accediendo al atributo privado mediante un método: " + getAtributoPrivado());
    }
}

