//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package es.cullera.clasepersona;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    public void mostrar() {
        System.out.println("Soy el profesor: " + this.nombre + ", mi edad es: " + this.edad + " y doy la asignatura de: " + this.asignatura);
    }
}
