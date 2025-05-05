package com.josehs.tema10.Ejercicio3;

public class Coche {
    private String matricula;
    private int vActual;
    private int marchaActual;
    private int[] vMaxima;

    public Coche(String matricula, int nMarchas) {
        this.matricula = matricula;
        this.vActual = 0;
        this.marchaActual = 0;
        this.vMaxima = new int[nMarchas + 1];
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidadActual() {
        return vActual;
    }

    public void setVelocidadActual(int vActual) {
        this.vActual = vActual;
    }

    public int getMarchaActual() {
        return marchaActual;
    }

    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }

    public int[] getVelocidadesMaximas() {
        return vMaxima;
    }

    public void setVelocidadesMaximas(int[] vMaxima) {
        this.vMaxima = vMaxima;
    }

    //Hacemos que se vaya cambiando la velocidad actual con valores mayores
    public void acelerar(int incremento) {
        vActual += incremento;
        if (vActual < 0) {
            vActual = 0;
        }
    }

    //Hacemos que se vaya cambiando la velocidad actual con valores menores
    public void frenar(int decremento) {
        vActual -= decremento;
        if (vActual < 0) {
            vActual = 0;
        }
    }

    @Override
    public String toString() {
        return "Coche [Matrícula: " + matricula + ", Velocidad: " + vActual + " km/h, Marcha: " + marchaActual + "]";
    }

    //Cambiamos el valor de la marcha teniendo en la velocidad en cada marcha
    public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha >= 0 && nuevaMarcha < vMaxima.length) {
            marchaActual = nuevaMarcha;
        }
    }
}
