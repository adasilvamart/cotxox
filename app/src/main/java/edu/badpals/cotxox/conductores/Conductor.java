package edu.badpals.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0.0;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

    public Conductor() {
    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return this.valoracionMedia;
    }

    public int getNumeroValoraciones() {
        return this.valoraciones.size();
    }

    public void setValoracion(byte valoracion) {
        valoraciones.add(valoracion);
        this.valoracionMedia = calcularValoracionMedia();
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    private double calcularValoracionMedia() {
        return valoraciones.stream()
                           .mapToDouble(Double::valueOf)
                           .sum() / valoraciones.size();
    }
}
