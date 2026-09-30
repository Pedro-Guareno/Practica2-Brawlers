import static lib.in.in;

public class Ejercico80 {
    static void main() {

        String frase = in.leerLine("Escribe una frase:\n");
        String subcadena = in.leerLine("Escribe la subcadena a buscar:\n");

        int contador = 0;
        int pos = 0;

        while ((pos = frase.indexOf(subcadena, pos)) != -1) {
            contador++;
            pos += subcadena.length();
        }

        System.out.println("Numero de veces que aparece la subcadena en la frase: " + contador);
        System.out.println("Presione una tecla para continuar . . .");
    }
}
