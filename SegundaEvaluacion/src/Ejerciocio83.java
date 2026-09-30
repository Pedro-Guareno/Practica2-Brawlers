import static java.lang.IO.println;
import static lib.in.leerInt;

public class Ejerciocio83 {
    static void main() {

        int a = leerInt("Escribe un entero: ");
        String s = String.valueOf(a);
        s = new StringBuilder(s).reverse().toString();
        int b = Integer.parseInt(s);
        if (a==b) println("Es capicúa");
        else println("No es capicúa");
    }
}
