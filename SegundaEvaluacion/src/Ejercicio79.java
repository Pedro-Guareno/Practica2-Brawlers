import static lib.in.leerLine;

public class Ejercicio79 {
    static void main() {

        String s = leerLine("Escribe una frase: ");
        s = s.toUpperCase();
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();

        System.out.println(s1);

    }
}
