package PGV.viajes;

import PGV.interfaces.Desplazarse;
import PGV.excepciones.LongitudException;

public class ViajeEspacial implements Desplazarse, Comparable<ViajeEspacial> {

    private String nombre;
    private double longitud;
    private boolean desplazado;

    public ViajeEspacial(String nombre, double longitud, boolean desplazado) throws LongitudException {
        if (longitud > DISTANCIA) {
            throw new LongitudException("La longitud supera la distancia permitida");
        }
        this.nombre = nombre;
        this.longitud = longitud;
        this.desplazado = desplazado;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double getLongitud() {
        return longitud;
    }

    public boolean getDesplazado() {
        return desplazado;
    }

    @Override
    public void setLongitud(double km) {
        this.longitud = km;
    }

    public void irse() {
        this.longitud++;
    }

    public void regresar() {
        this.longitud--;
    }

    @Override
    public boolean desplazado() {
        return longitud > DISTANCIA;
    }

    @Override
    public int compareTo(ViajeEspacial o) {
        if (o == null) return 1;
        if (this.nombre == null) return 1;
        if (o.nombre == null) return 1;
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "El viaje " + nombre + " está a una longitud de " + longitud + " km.";
    }
}