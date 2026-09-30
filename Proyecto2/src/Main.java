import java.util.Scanner;
public class Main {
    public static int leerInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        System.out.println("5. Salir");

        int opcion;

        while (true) {
            opcion = leerInt("Elije una opción: ");
            int numero1 = leerInt("Escribe un número: ");
            int numero2 = leerInt("Escribe otro número:  ");
            int resultado;

            if(opcion == 1){
                resultado = numero1 + numero2;
            }
            else if ( opcion == 2){
                resultado = numero1 - numero2;
            }
            else if (opcion == 3){
                resultado = numero1 / numero2;
            }
            else if (opcion == 4){
            }
        }

    }
}