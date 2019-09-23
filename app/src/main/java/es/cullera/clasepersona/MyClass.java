//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package es.cullera.clasepersona;

import java.util.ArrayList;

public class MyClass {
    public MyClass() {
    }

    public static void main(String[] args) {
        Persona x = new Persona("Adrián", 20);
        x.mostrar();
        ArrayList<Persona> p = new ArrayList();
        p.add(new Persona("Adrián2", 19));

        for(int i = 0; i < p.size(); ++i) {
            ((Persona)p.get(i)).mostrar();
        }

        Profesor p2 = new Profesor("Andrés", 35, "Aplicaciones");
        p2.mostrar();
        Alumno p3 = new Alumno("Nacho", 20, 29);
        p3.mostrar();
    }
}
