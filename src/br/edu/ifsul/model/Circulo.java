package br.edu.ifsul.model;

import java.util.Objects;

public class Circulo{
    private int id;
    private Double raio;

    public Circulo(){
    }

    public Circulo (int id, double raio) {
        this.id = id;
        this.raio = raio;
    }

    public double calculaArea(double raio){
        return Math.PI * (raio * raio);
    }

    public double calculaPerimetro(double raio){
        return 2 * Math.PI * raio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo)) return false;
        Circulo circulo = (Circulo) o;
        return getId() == circulo.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "id=" + id +
                ", raio=" + raio +
                '}';
    }
}
