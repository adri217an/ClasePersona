//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package es.cullera.clasepersona;

public class Alumno extends Persona {
    private int suspensos;

    public Alumno(String nombre, int edad, int suspensos) {
        super(nombre, edad);
        this.suspensos = suspensos;
    }

    public void mostrar() {
        System.out.println("Soy el alumno: " + this.nombre + ", mi edad es: " + this.edad + " y he suspendido: " + this.suspensos);
    }
}
