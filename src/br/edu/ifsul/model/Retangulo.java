package br.edu.ifsul.model;

import java.util.Objects;

public class Retangulo{
    private int id;
    private Double lado;
    private Double altura;

    public Retangulo() {
    }

    public Retangulo(int id, Double lado, Double altura) {
        this.id = id;
        this.lado = lado;
        this.altura = altura;
    }

    public double calculaArea(double lado, double altura){
        return lado * altura;
    }

    public double calculaPerimetro(double lado, double altura){
        return (2 * lado) + (2 * altura);
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

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Retangulo)) return false;
        Retangulo retangulo = (Retangulo) o;
        return getId() == retangulo.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "id=" + id +
                ", lado=" + lado +
                ", altura=" + altura +
                '}';
    }
}
