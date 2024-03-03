package org.iesalandalus.programacion.reservashotel.modelo.dominio;

public class Doble extends Habitacion{
    private final int NUM_MAXIMO_PERSONAS=2;
    final int MIN_NUM_CAMAS_INDIVIDUALES=0;
    final int MAX_NUM_CAMAS_INDIVIDUALES=2;
    final int MIN_NUM_CAMAS_DOBLES=0;
    final int MAX_NUM_CAMAS_DOBLES=1;
    private int numCamasIndividuales;
    private int numCamasDobles;

    public Doble (int planta, int puerta, double precio, int numCamasIndividuales, int numCamasDobles){
        super(planta, puerta, precio);
        setNumCamasIndividuales(numCamasIndividuales);
        setNumCamasDobles(numCamasDobles);
        validaNumCamas();
    }
    public Doble (Doble habitacionDoble){
        super(habitacionDoble);
        setNumCamasIndividuales(habitacionDoble.getNumCamasIndividuales());
        setNumCamasDobles(habitacionDoble.getNumCamasDobles());
        validaNumCamas();
    }

    public int getNumCamasIndividuales() {
        return numCamasIndividuales;
    }

    public void setNumCamasIndividuales(int numCamasIndividuales) {
        if (numCamasIndividuales < MIN_NUM_CAMAS_INDIVIDUALES || numCamasIndividuales > MAX_NUM_CAMAS_INDIVIDUALES)
            throw new IllegalArgumentException("No puede tener menos indv del mínimo y mas del máx");

        this.numCamasIndividuales = numCamasIndividuales;
    }

    public int getNumCamasDobles() {
        return numCamasDobles;
    }

    public void setNumCamasDobles(int numCamasDobles) {
        if (numCamasDobles < MIN_NUM_CAMAS_DOBLES || numCamasDobles > MAX_NUM_CAMAS_DOBLES)
            throw new IllegalArgumentException("No puede tener menos dobles del mínimo y mas del máx");
        this.numCamasDobles = numCamasDobles;
    }

    private void validaNumCamas(){
        if (numCamasDobles == 0 && numCamasIndividuales != 2)
            throw new IllegalArgumentException("El número de camas dobles es incorrecto (doble)");
        if (numCamasDobles == 1 && numCamasIndividuales != 0)
            throw new IllegalArgumentException("El número de camas individuales está mal (doble)");
    }
    @Override
    public int getNumeroMaximoPersonas(){
        return NUM_MAXIMO_PERSONAS;
    }

    @Override
    public String toString() {
        return super.toString()+"numCamasIndividuales=" + numCamasIndividuales +", numCamasDobles=" + numCamasDobles;
    }
}
