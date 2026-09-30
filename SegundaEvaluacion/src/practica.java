import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> lista = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;

        do {

            for(int i = 0; i < 30; i++) System.out.println();

            System.out.println("===== MENU =====");
            System.out.println("1. Reiniciar colección");
            System.out.println("2. Ordenar colección");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Calcular medias");
            System.out.println("5. Eliminar menor");
            System.out.println("6. Eliminar pares");
            System.out.println("0. Salir");

            opcion = in.leerInt("Opción: ");

            switch(opcion) {
                case 1: reiniciar(); break;
                case 2: ordenar(); break;
                case 3: mostrar(); break;
                case 4: medias(); break;
                case 5: eliminarMenor(); break;
                case 6: eliminarPares(); break;
            }

            in.detener();

        } while(opcion != 0);
    }

    // =========================
    // A) REINICIAR
    // =========================
    static void reiniciar() {

        lista.clear();

        while(lista.size() < 20) {
            int num = (int)(Math.random() * 90 + 10);

            if(!lista.contains(num)) {
                lista.add(num);
            }
        }

        System.out.println("Colección reiniciada");
    }

    // =========================
    // B) ORDENAR
    // =========================
    static void ordenar() {

        ArrayList<Integer> nueva = new ArrayList<>();

        // 10-30 creciente
        for(int i = 10; i <= 30; i++) {
            if(lista.contains(i)) nueva.add(i);
        }

        // 31-60 decreciente
        for(int i = 60; i >= 31; i--) {
            if(lista.contains(i)) nueva.add(i);
        }

        // resto pares
        for(int n : lista) {
            if(n < 10 || n > 60) {
                if(n % 2 == 0) nueva.add(n);
            }
        }

        // resto impares
        for(int n : lista) {
            if(n < 10 || n > 60) {
                if(n % 2 != 0) nueva.add(n);
            }
        }

        lista = nueva;

        System.out.println("Colección ordenada");
    }

    // =========================
    // C) MOSTRAR
    // =========================
    static void mostrar() {

        int contador = 0;

        for(int n : lista) {
            System.out.print(n + " ");
            contador++;

            if(contador == 5) {
                System.out.println();
                contador = 0;
            }
        }

        System.out.println();
    }

    // =========================
    // D) MEDIAS
    // =========================
    static void medias() {

        int suma1 = 0;
        int suma2 = 0;

        for(int i = 0; i < 5; i++) {
            suma1 += lista.get(i);
        }

        for(int i = lista.size() - 5; i < lista.size(); i++) {
            suma2 += lista.get(i);
        }

        System.out.println("Media primeros: " + (suma1 / 5));
        System.out.println("Media últimos: " + (suma2 / 5));
    }

    // =========================
    // E) ELIMINAR MENOR
    // =========================
    static void eliminarMenor() {

        if(lista.size() <= 10) {
            System.out.println("La colección no tiene más de 10 datos");
            return;
        }

        int menor = lista.get(0);
        int pos = 0;

        for(int i = 1; i < lista.size(); i++) {
            if(lista.get(i) < menor) {
                menor = lista.get(i);
                pos = i;
            }
        }

        lista.remove(pos);

        System.out.println("Eliminado: " + menor + " en posición " + pos);
    }

    // =========================
    // F) ELIMINAR PARES
    // =========================
    static void eliminarPares() {

        boolean eliminado = false;

        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i) % 2 == 0) {
                lista.remove(i);
                i--;
                eliminado = true;
            }
        }

        if(!eliminado) {
            System.out.println("No se ha podido eliminar el dato");
            return;
        }

        if(lista.size() < 10) {
            while(lista.size() < 10) {
                lista.add(10);
            }
            System.out.println("Se han eliminado los pares y se ha completado la colección");
        } else {
            System.out.println("Se han eliminado los pares");
        }

        mostrar();
    }
}