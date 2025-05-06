package com.josehs.tema10.Ejercicio4;

public class Television extends Electrodomestico {

    private static final int RESOLUCION_POR_DEFECTO = 20;
    private static final boolean SMARTTV_POR_DEFECTO = false;

    private int resolucion;
    private boolean smartTV;

    public Television() {
        super();
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.smartTV = SMARTTV_POR_DEFECTO;
    }

    public Television(double precioBase, double tamanyo) {
        super(precioBase, tamanyo);
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.smartTV = SMARTTV_POR_DEFECTO;
    }

    public Television(int resolucion, boolean smartTV, double precioBase, String color, char consumoEnergetico, double tamanyo) {
        super(precioBase, color, consumoEnergetico, tamanyo);
        this.resolucion = resolucion;
        this.smartTV = smartTV;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (this.resolucion > 40) {
            precioFinal *= 1.30;
        }

        if (this.smartTV) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
