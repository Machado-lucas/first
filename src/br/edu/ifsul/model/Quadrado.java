package br.edu.ifsul.model;

import java.util.Objects;

public class Quadrado{

    private int id;
    private Double lado;

    public Quadrado() {
    }

    public Quadrado(int id, Double lado) {
        this.id = id;
        this.lado = lado;
    }

    public double calculaArea(double lado){
        return lado * lado;
    }

    public double calculaPerimetro (double lado){
        return 4 * lado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quadrado)) return false;
        Quadrado quadrado = (Quadrado) o;
        return getId() == quadrado.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "id=" + id +
                ", lado=" + lado +
                '}';
    }
}
