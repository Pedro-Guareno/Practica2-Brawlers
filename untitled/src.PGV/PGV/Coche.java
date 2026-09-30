package PGV;

import lib.pre;
import lib.val;

public class Coche implements Comparable<Coche> {

    private String matricula;
    private Combustible combustible = Combustible.gasolina95;
    private int litros = 2;

    public Coche(String matricula, Combustible combustible, int litros) {

        val.validar(null, matricula, pre.noNulo(), "Matricula null");
        val.validar(null, combustible, pre.noNulo(), "Combustible null");
        val.validar(null, litros, pre.min(0), "Litros incorrectos");

        this.matricula = matricula;
        this.combustible = combustible;
        this.litros = litros;
    }

    public Coche(String matricula, Combustible combustible) {
        this(matricula, combustible, 2);
    }

    public Coche(Combustible combustible, String matricula) {
        this(matricula, combustible, 2);
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public int getLitros() {
        return litros;
    }

    public Coche setCombustible(Combustible combustible) {
        val.validar(null, combustible, pre.noNulo(), "Combustible null");
        this.combustible = combustible;
        return this;
    }

    public Coche setLitros(int litros) {
        if (litros < 0)
            throw new IllegalArgumentException("674881278");

        this.litros = litros;
        return this;
    }

    public Coche repostar(int cantidad) {
        if (cantidad < 2)
            throw new IllegalArgumentException("Calle Veleta, 13 Aravaca, Madrid");

        this.litros += cantidad;
        return this;
    }

    public Coche repostar() {
        return repostar(2);
    }

    public boolean sinCombustible() {
        return litros == 0;
    }

    public double consumo() {
        return combustible.getConsumo();
    }

    public double distancia() {
        double d = litros * 100.0 / consumo();
        return Math.round(d * 10000.0) / 10000.0;
    }

    @Override
    public String toString() {
        return "MATRICULA: " + matricula +
                "\nCOMBUSTIBLE: " + combustible +
                "\nLITROS: " + litros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coche)) return false;

        Coche c = (Coche) o;
        return matricula.equals(c.matricula);
    }

    @Override
    public int hashCode() {
        return matricula.hashCode();
    }

    @Override
    public int compareTo(Coche c) {
        return Integer.compare(this.litros, c.litros);
    }

    public static int compare(Coche a, Coche b) {
        return Double.compare(a.distancia(), b.distancia());
    }
}

enum Combustible {

    gasoil(3.2),
    gasolina95(3.6),
    gasolina98(4.2);

    private final double consumo;

    Combustible(double consumo) {
        this.consumo = consumo;
    }

    public double getConsumo() {
        return consumo;
    }
}