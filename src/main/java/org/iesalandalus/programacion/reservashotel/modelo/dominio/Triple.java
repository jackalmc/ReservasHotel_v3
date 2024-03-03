package org.iesalandalus.programacion.reservashotel.modelo.dominio;

public class Triple extends Habitacion{
    private final int NUM_MAXIMO_PERSONAS=3;
    final int MIN_NUM_BANOS=1;
    final int MAX_NUM_BANOS=2;
    final int MIN_NUM_CAMAS_INDIVIDUALES=1;
    final int MAX_NUM_CAMAS_INDIVIDUALES=3;
    final int MIN_NUM_CAMAS_DOBLES=0;
    final int MAX_NUM_CAMAS_DOBLES=1;
    private int numBanos;
    private int numCamasIndividuales;
    private int numCamasDobles;

    public Triple (int planta, int puerta, double precio, int numBanos, int numCamasIndividuales, int numCamasDobles){
        super(planta, puerta, precio);
        setNumBanos(numBanos);
        setNumCamasIndividuales(numCamasIndividuales);
        setNumCamasDobles(numCamasDobles);
        validaNumCamas();
    }

    public Triple (Triple habitacionTriple){
        super(habitacionTriple);
        setNumBanos(habitacionTriple.getNumBanos());
        setNumCamasIndividuales(habitacionTriple.getNumCamasIndividuales());
        setNumCamasDobles(habitacionTriple.getNumCamasDobles());
        validaNumCamas();
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) {
        if (numBanos < MIN_NUM_BANOS || numBanos > MAX_NUM_BANOS)
            throw new IllegalArgumentException("El número de baños mal (triple)");

        this.numBanos = numBanos;
    }

    public int getNumCamasIndividuales() {
        return numCamasIndividuales;
    }

    public void setNumCamasIndividuales(int numCamasIndividuales) {
        if (numCamasIndividuales < MIN_NUM_CAMAS_INDIVIDUALES || numCamasIndividuales > MAX_NUM_CAMAS_INDIVIDUALES)
            throw new IllegalArgumentException("No puede tener menos indv del mínimo y mas del máx (triple)");

        this.numCamasIndividuales = numCamasIndividuales;
    }

    public int getNumCamasDobles() {
        return numCamasDobles;
    }

    public void setNumCamasDobles(int numCamasDobles) {
        if (numCamasDobles < MIN_NUM_CAMAS_DOBLES || numCamasDobles > MAX_NUM_CAMAS_DOBLES)
            throw new IllegalArgumentException("No puede tener menos dobles del mínimo y mas del máx(triple)");

        this.numCamasDobles = numCamasDobles;
    }

    private void validaNumCamas(){
        if (numCamasDobles == 0 && numCamasIndividuales != 3)
            throw new IllegalArgumentException("El número de camas dobles es incorrecto (triple)");
        if (numCamasDobles == 1 && numCamasIndividuales != 1)
            throw new IllegalArgumentException("El número de camas individuales está mal (triple)");
    }

    @Override
    public int getNumeroMaximoPersonas(){
        return NUM_MAXIMO_PERSONAS;
    }

    @Override
    public String toString() {
        return super.toString()+"Triple{" +
                "numBanos=" + numBanos +
                ", numCamasIndividuales=" + numCamasIndividuales +
                ", numCamasDobles=" + numCamasDobles +
                '}';
    }
}
