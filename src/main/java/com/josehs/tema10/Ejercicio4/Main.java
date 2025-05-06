package com.josehs.tema10.Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static Random random = new Random();
    public static void main(String[] args) {

        //Creamos una lista de electrodomesticos
        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        //Llenamos una lista con 10 electrodomesticos, lavadoras y televisiones.
        for (int i = 0; i < 10; i++) {
            int tipo = random.nextInt(3);

            switch (tipo) {
                case 0:
                    electrodomesticos.add(new Electrodomestico(
                            random.nextDouble() * 500,
                            "blanco",
                            (char) ('A' + random.nextInt(6)),
                            random.nextDouble() * 80
                    ));
                    break;
                case 1:
                    electrodomesticos.add(new Lavadora(
                            random.nextInt(50),
                            random.nextDouble() * 500,
                            "negro",
                            (char) ('A' + random.nextInt(6)),
                            random.nextDouble() * 80
                    ));
                    break;
                case 2:
                    electrodomesticos.add(new Television(
                            random.nextInt(80) + 20,
                            random.nextBoolean(),
                            random.nextDouble() * 500,
                            "gris",
                            (char) ('A' + random.nextInt(6)),
                            random.nextDouble() * 80
                    ));
                    break;
            }
        }

        double totalElectrodomesticos = 0;
        double totalLavadoras = 0;
        double totalTelevisiones = 0;

        //Hacer un bucle con instanceof


        System.out.println("Importe total de Electrodomésticos: " + totalElectrodomesticos + " €");
        System.out.println("Importe total de Lavadoras: " + totalLavadoras + " €");
        System.out.println("Importe total de Televisiones: " + totalTelevisiones + " €");
    }
}
