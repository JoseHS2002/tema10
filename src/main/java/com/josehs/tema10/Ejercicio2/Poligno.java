package com.josehs.tema10.Ejercicio2;

import com.josehs.tema10.Ejercicio1.Punto;
import java.util.ArrayList;
import java.util.List;

public class Poligno {

    public List<Punto> v;

    public void Poligono(List<Punto> v) {
        this.v = new ArrayList<>(v);
    }

    public void trasladar(double desX, double desY) {
        for (Punto punto : v) {
            punto.x += desX;
            punto.y += desY;
        }
    }

    public int nV() {
        return v.size();
    }

    //Calculamos el perimetro del poligno
    public double perimetro() {
        double perimetro = 0.0;
        int nV = v.size();

        if (nV < 3) {
            return 0.0;
        }

        for (int i = 0; i < nV; i++) {
            Punto pA = v.get(i);
            Punto pS = v.get((i + 1) % nV);
            perimetro += pA.distancia(pS);
        }

        return perimetro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Punto punto : v) {
            sb.append(punto.toString()).append("\n");
        }
        return sb.toString();
    }

}
