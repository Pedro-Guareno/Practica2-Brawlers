public class Ejercicio29 {
    public static void main(String[] args) {
        int[][] tabla = new int[10][10];
        int i, j, c = 0, u = 0, r = 0;

        for (i = 0; i < 100; i++) {
            int f = (int) (Math.random() * 10);
            int col = (int) (Math.random() * 10);

            if (tabla[f][col] == 1) {
                r++;
            } else {
                tabla[f][col] = 1;
            }
        }

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (tabla[i][j] == 0) {
                    c++;
                } else {
                    u++;
                }
            }
        }

        System.out.println("Total celdas con 0: " + c);
        System.out.println("Total celdas con 1: " + u);
        System.out.println("Celdas aleatorias repetidas: " + r);
    }
}