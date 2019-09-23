//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package es.cullera.clasepersona;

import java.util.ArrayList;

public class EjemplosArrays {
    public EjemplosArrays() {
    }

    public static void main(String[] args) {
        String[] a = new String[]{"Hola", "mundo"};
        String[] b = new String[]{"Quién", "eres?"};

        for(int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }

        String[] var7 = b;
        int i = b.length;

        for(int var5 = 0; var5 < i; ++var5) {
            String x = var7[var5];
            System.out.println(x);
        }

        ArrayList<String> listaCosas = new ArrayList();
        listaCosas.add("Antsu");
        listaCosas.add("Fati");
        System.out.println(listaCosas);

        for(i = 0; i < listaCosas.size(); ++i) {
            System.out.println(((String)listaCosas.get(i)).toUpperCase());
        }

    }
}
