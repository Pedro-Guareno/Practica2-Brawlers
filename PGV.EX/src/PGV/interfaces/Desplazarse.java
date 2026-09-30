package PGV.interfaces;

public interface Desplazarse {

    public static final double DISTANCIA = 8000;

    void setLongitud(double km);
    double getLongitud();
    boolean desplazado();
}