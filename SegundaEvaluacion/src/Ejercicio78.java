public class Ejercicio78 {
    static void main() {

        String s = leerLine("Escribe el nombre y apellido\n");
        s=s. trim();
        while(s.contains("  "))s=s.replace("  "," ");
        System.out.println(s);
    }
}
