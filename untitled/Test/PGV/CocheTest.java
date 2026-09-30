package PGV;

import org.junit.jupiter.api.Test;

@Test
public class TestCoche {

    public static void main(String[] args) {

        Coche c1 = new Coche("1234ABC", Combustible.gasolina95, 10);
        Coche c2 = new Coche("5678DEF", Combustible.gasoil);
        Coche c3 = new Coche(Combustible.gasolina98, "9999ZZZ");

        System.out.println("=== COCHES ===");
        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();
        System.out.println(c3);

        c1.repostar(5);
        c2.repostar();

        System.out.println("\n=== DESPUÉS DE REPOSTAR ===");
        System.out.println("C1 litros: " + c1.getLitros());
        System.out.println("C2 litros: " + c2.getLitros());

        System.out.println("\n=== CONSUMO Y DISTANCIA ===");
        System.out.println("C1 consumo: " + c1.consumo());
        System.out.println("C1 distancia: " + c1.distancia());

        System.out.println("C2 consumo: " + c2.consumo());
        System.out.println("C2 distancia: " + c2.distancia());

        System.out.println("\n=== COMPARACIÓN ===");
        System.out.println("compareTo (litros C1 vs C2): " + c1.compareTo(c2));
        System.out.println("compare (distancia C1 vs C2): " + Coche.compare(c1, c2));

        Coche c4 = new Coche("1234ABC", Combustible.gasoil, 20);
        System.out.println("\n=== EQUALS ===");
        System.out.println("C1 equals C4: " + c1.equals(c4));
    }
}