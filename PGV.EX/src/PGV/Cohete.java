package PGV;

import PGV.viajes.ViajeEspacial;
import PGV.excepciones.LongitudException;
import PGV.excepciones.XException;
import PGV.excepciones.YException;

public final class Cohete extends ViajeEspacial {

    private int x = 0;
    private int y = 0;
    private int potencia = 1;

    public Cohete(String nombre, double longitud, boolean desplazado,
                  int x, int y, int potencia)
            throws LongitudException, XException, YException {

        super(nombre, longitud, desplazado);

        setX(x);
        setY(y);

        if (potencia <= 0) {
            this.potencia = 1;
        } else {
            this.potencia = potencia;
        }
    }


    public Cohete(String nombre, int x, int y)
            throws LongitudException, XException, YException {

        super(nombre, 0, false); // longitud 0, desplazado false por defecto

        setX(x);
        setY(y);
        this.potencia = 1;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPotencia() {
        return potencia;
    }


    public Cohete setX(int x) throws XException {
        if (x < -180 || x > 180) {
            throw new XException("X fuera de rango (-180 a 180)");
        }
        this.x = x;
        return this;
    }

    public Cohete setY(int y) throws YException {
        if (y < -90 || y > 90) {
            throw new YException("Y fuera de rango (-90 a 90)");
        }
        this.y = y;
        return this;
    }



    @Override
    public String toString() {
        return super.toString() +
                "\nEl satélite está en la posición (" + x + "," + y + ")";
    }

    @Override
    public int compareTo(ViajeEspacial o) {
        return super.compareTo(o);
    }

    public void irse() {
        super.irse();
        x++;
        y++;
    }

    public void regresar() {
        super.regresar();
        x--;
        y--;
    }
}
