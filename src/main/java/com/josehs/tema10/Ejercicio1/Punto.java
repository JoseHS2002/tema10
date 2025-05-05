package com.josehs.tema10.Ejercicio1;

public class Punto {
    public double x,y;

    public static void main(String[] args) {
        Punto p1 = new Punto(3.0, 4.0);
        Punto p2 = new Punto(6.0, 8.0);
        Punto p3 = new Punto();

        System.out.println("Punto 1: " + p1.toString());
        System.out.println("Punto 2: " + p2.toString());
        System.out.println("Punto 3: " + p3.toString());

        double dis12 = p1.distancia(p2);
        System.out.println("Distancia entre p1 y p2: " + dis12);
        double dis13 = p1.distancia(p3);
        System.out.println("Distancia entre p1 y p3: " + dis13);
    }

    //Hacemos los atributos de la clase Punto
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Establecemos los valores de x e y en 0
    public Punto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    //Indicamos la distancia que hay entre el valor inicial y el valor que le hayamos indicado
    public double distancia(Punto oP) {
        double disX = this.x - oP.x;
        double disY = this.y - oP.y;
        return Math.sqrt(disX * disX + disY * disY);
    }
    
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
