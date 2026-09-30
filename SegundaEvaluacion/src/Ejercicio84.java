import static lib.in.leerLine;

public class Ejercicio84 {
    static void main() {

        String frase = leerLine("Escribe un frase sin acentos: ").toLowerCase();

        for (char c = 'a';c<='z';c++) {

            int veces = frase.replaceAll("[b]","").length();
            if (veces>0) System.out.println(""+c+":b"+veces);
        }
        int veces = frase.replaceAll("[b]","").length();

    }
}