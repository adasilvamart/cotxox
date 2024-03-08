package edu.badpals.cotxox.carrera;

import edu.badpals.cotxox.conductores.Conductor;
import edu.badpals.cotxox.conductores.PoolConductores;
import edu.badpals.cotxox.tarifa.Tarifa;

public class Carrera {
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0.0;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0.0;
    private int propina = 0;
    private Conductor conductor = null;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempo) {
        this.tiempoCarrera = tiempo;
    }

    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempo) {
        this.tiempoEsperado = tiempo;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    public void asignarConductor(PoolConductores conductores) {
        this.conductor = conductores.asignarConductor();
    }

    public Conductor getConductor() {
        return this.conductor;
    }
    
}
