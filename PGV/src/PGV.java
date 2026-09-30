public class PGV {

    public static void main(String[] args) {

        int tabla[][];
        int valor;

        do{

            valor = numero();
            tabla = generar();

            if(valor==0)
                System.out.println("0: Comprobar si hay más pares que impares");
            else
                System.out.println("1: Comprobar si hay alguna fila con exactamente tres unos");

            mostrar(tabla);

        }while(!pares(tabla) && !tres(tabla));

    }

    public static int[][] generar(){

        int tabla[][] = new int[5][5];

        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                tabla[i][j]=(int)(Math.random()*10);

        return tabla;

    }

    public static void mostrar(int tabla[][]){

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++)
                System.out.print(tabla[i][j]);
            System.out.println();
        }

    }

    public static int numero(){

        return (int)(Math.random()*2);

    }

    public static boolean pares(int tabla[][]){

        int pares=0;
        int impares=0;

        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                if(tabla[i][j]%2==0) pares++;
                else impares++;

        return pares>impares;

    }

    public static boolean tres(int tabla[][]){

        for(int i=0;i<5;i++)
            for(int j=0;j<3;j++)
                if(tabla[i][j]==1 && tabla[i][j+1]==1 && tabla[i][j+2]==1)
                    return true;

        return false;

    }

}