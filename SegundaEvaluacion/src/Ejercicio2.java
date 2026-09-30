import java.util.Arrays;

import static java.lang.Math.random;
import static lib.in.leerInt;

public class Ejercicio2 {
    static void main(String[] args) {

        int[] a = new int[leerInt("Escribe el tamaño: ", v->v>0)];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (random()*10);
        }

        Arrays.setAll(a,i->(int) (random()*10));


        int[] c = crear();
        rellenar(c);
    }

    public static void rellenar(final int[] a){
        a = new int[20];
    }

    private static int[] crear() {
        int[] b = new int[leerInt("Escribe el tamaño: ",v->v>0)];
        return b;
    }
}
