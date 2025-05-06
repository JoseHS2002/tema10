package com.josehs.tema10.Ejercicio4;

public class Lavadora extends Electrodomestico {

    private static final int CARGA_POR_DEFECTO = 5;

    private int carga;

    public Lavadora() {
        super();
        this.carga = CARGA_POR_DEFECTO;
    }

    /**
     * El valor de la carga de la lavadora es la carga_por_defecto
     * @param precioBase
     * @param tamanyo
     */
    public Lavadora(double precioBase, double tamanyo) {
        super(precioBase, tamanyo);
        this.carga = CARGA_POR_DEFECTO;
    }

    /**
     * A lo anterior agragamos carga, color, consumoEnergetico
     * @param carga
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param tamanyo
     */
    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, double tamanyo) {
        super(precioBase, color, consumoEnergetico, tamanyo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (this.carga > 30) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
