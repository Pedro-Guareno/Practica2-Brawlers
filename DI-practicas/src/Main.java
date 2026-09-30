

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int readInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
    public static String readString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.toString();
    }

    public static ArrayList<Brawler> brawlers = new ArrayList<>();

    public static void main(String[] args){

        int eleccion = 0;

        do {

            System.out.println("1. Ver Brawlers: ");
            System.out.println("2. Creear Brawler Legendario: ");
            System.out.println("3. Creer Brawler Épico: ");
            System.out.println("4. Combatir: ");
            System.out.println("5. Salir: ");

            eleccion = readInt("Eleccion: ");


            switch (eleccion) {
                case 1: VerBrawler(); break;
                case 2: CrearLegendario(); break;
                case 3: CrearEpico(); break;
                case 4: Combatir(); break;
            }

        }while (eleccion != 5);
    }


    public static void VerBrawler() {

        if (brawlers.size() == 0) {
            System.out.println("Todavía no hay nada creado \n");
        }
        else {
            for (int i = 0; i < brawlers.size(); i++){
                System.out.println("["+brawlers.get(i).getName()+"]");
        }
    }
}

    public static void CrearLegendario() {

        String name = readString("Nombre: ");
        int health = readInt("Vida: ");
        int damage = readInt("Daño: ");
    }

    public static void CrearEpico() {

        String nombre = readString("Nombre: ");
        int health = readInt("Vida: ");
        int curitas = readInt("Curitas: ");
    }

    private static void Combatir() {

        String nombre1 = readString("Nombre del primer brawler: ");
        String nombre2 = readString("Nombre del segundo brawler: ");

        Brawler luchador1 = null;
        Brawler luchador2 = null;

        for (int i = 0; i < brawlers.size(); i++) {
            if (brawlers.get(i).getName().equals(nombre1)) {
                luchador1 = brawlers.get(i);
            } else if (brawlers.get(i).getName().equals(nombre2)) {
                luchador2 = brawlers.get(i);
            }
        }

        if (luchador1 == null || luchador2 == null) {
            System.out.println("No se ha encontrado uno de los brawlers");
        } else {
            System.out.println("[" + luchador1.getName() + ":" + luchador1.getHealth() + "]");
            System.out.println("[" + luchador2.getName() + ":" + luchador2.getHealth() + "]\n");

            luchador1.accionEspecial(luchador2);
            luchador2.accionEspecial(luchador1);
        }
    }
}
