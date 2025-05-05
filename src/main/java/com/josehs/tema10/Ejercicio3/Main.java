package com.josehs.tema10.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce la matrícula del coche: ");
        String matricula = scanner.nextLine();

        System.out.print("¿El coche es con cambio automático? (s/n): ");
        String esAutomaticoStr = scanner.nextLine();
        //Comprobar si es automatico y ignorar mayuscula
        boolean esAutomatico = esAutomaticoStr.equalsIgnoreCase("s");

        System.out.print("Introduce el número de marchas del coche: ");
        int numeroMarchas = scanner.nextInt();
        scanner.nextLine();

        Coche coche;
        if (esAutomatico) {
            coche = new CocheAutomatico(matricula, numeroMarchas);

            int[] vMaximas = coche.getVelocidadesMaximas();
            vMaximas[1] = 30;
            vMaximas[2] = 50;
            vMaximas[3] = 80;
            vMaximas[4] = 120;
            coche.setVelocidadesMaximas(vMaximas);
        } else {
            //La primera marcha es la 3
            coche = new CocheManual(matricula, numeroMarchas);

            int[] vMaximas = coche.getVelocidadesMaximas();
            vMaximas[1] = 20;
            vMaximas[2] = 40;
            vMaximas[3] = 60;
            vMaximas[4] = 90;
            coche.setVelocidadesMaximas(vMaximas);

            if (!esAutomatico) {
                ((CocheManual) coche).cambiarMarcha(3);
                System.out.println(coche);
            }
        }

        System.out.println(coche);

        int incremento = 10;
        while (coche.getVelocidadActual() < 60) {
            coche.acelerar(incremento);
        }

        System.out.println(coche);



        scanner.close();
    }
}
