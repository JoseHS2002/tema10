package com.josehs.tema10.Ejercicio3;

public class CocheAutomatico extends Coche{

    public CocheAutomatico(String matricula, int nMarchas) {
        super(matricula, nMarchas);
    }

    @Override
    public void acelerar(int incremento) {
        super.acelerar(incremento);
        ajustarMarcha();
    }

    @Override
    public void frenar(int decremento) {
        super.frenar(decremento);
        ajustarMarcha();
    }

    //Cambiamos la marcha con los valores que le indiquemos
    private void ajustarMarcha() {
        int velocidad = getVelocidadActual();
        int[] velocidadesMaximas = getVelocidadesMaximas();

        for (int i = 1; i < velocidadesMaximas.length; i++) {
            if (velocidad <= velocidadesMaximas[i]) {
                setMarchaActual(i);
                return;
            }
        }
        setMarchaActual(velocidadesMaximas.length - 1);
    }
}
