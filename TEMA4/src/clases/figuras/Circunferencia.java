package clases.figuras;

public class Circunferencia {
    public final double RADIO_INCIAL = 1;
    private double radio = 1;

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){

        if(radio<=0)
            throw new IllegalArgumentException("RADIO");
        this.radio = radio;
    }
}
