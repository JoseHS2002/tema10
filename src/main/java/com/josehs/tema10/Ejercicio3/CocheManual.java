package com.josehs.tema10.Ejercicio3;

public class CocheManual extends Coche{

    public CocheManual(String matricula, int nMarchas) {
        super(matricula, nMarchas);
    }

    @Override
    public void cambiarMarcha(int nuevaMarcha) {
        if (nuevaMarcha >= 0 && nuevaMarcha-1 < getVelocidadesMaximas().length) {
            super.cambiarMarcha(nuevaMarcha);
        }
    }

}
