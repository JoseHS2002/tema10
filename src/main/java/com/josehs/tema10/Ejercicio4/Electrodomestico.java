package com.josehs.tema10.Ejercicio4;

public class Electrodomestico {

    private static final String COLOR_POR_DEFECTO = "blanco";
    private static final char CONSUMO_ENERGETICO_POR_DEFECTO = 'F';
    private static final double PRECIO_BASE_POR_DEFECTO = 100;
    private static final double PESO_POR_DEFECTO = 5;

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double tamanyo;

    private static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};

    public Electrodomestico() {
        this(PRECIO_BASE_POR_DEFECTO, PESO_POR_DEFECTO);
    }

    public Electrodomestico(double precioBase, double tamanyo) {
        this(precioBase, COLOR_POR_DEFECTO, CONSUMO_ENERGETICO_POR_DEFECTO, tamanyo);
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.tamanyo = tamanyo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getTamanyo() {
        return tamanyo;
    }

    private char comprobarConsumoEnergetico(char letra) {

    }

    private String comprobarColor(String color) {

    }

    public double precioFinal() {
        double precioFinal = this.precioBase;

        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }

        if (this.tamanyo >= 0 && this.tamanyo <= 19) {
            precioFinal += 10;
        } else if (this.tamanyo >= 20 && this.tamanyo <= 49) {
            precioFinal += 50;
        } else if (this.tamanyo >= 50 && this.tamanyo <= 79) {
            precioFinal += 80;
        } else {
            precioFinal += 100;
        }

        return precioFinal;
    }
}
