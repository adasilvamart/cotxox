package edu.badpals.cotxox.tarifa;

import edu.badpals.cotxox.carrera.Carrera;

public class Tarifa {
    static final double COSTE_MILLA = 1.35;
    static final double COSTE_MINUTO = 0.35;
    static final double COSTE_MINIMO = 5.0;
    static final byte PORCENTAJE_COMISION = 20;

    public static double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(int minutos) {
        return minutos * COSTE_MINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        return getCosteDistancia(carrera.getDistancia()) +  getCosteTiempo(carrera.getTiempoEsperado());
    }
}
