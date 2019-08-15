package br.edu.ifsul.control;

import br.edu.ifsul.model.Circulo;
import br.edu.ifsul.model.Quadrado;
import br.edu.ifsul.model.Retangulo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(1, 2.0);
        quadrado.setLado(4.0);
        System.out.println(quadrado);
        System.out.println("Lado do quadrado: " + quadrado.getLado());
        System.out.println("Área do quadrado: " + quadrado.calculaArea(quadrado.getLado()));
        System.out.println("Perímetro do quadrado: " + quadrado.calculaPerimetro(quadrado.getLado()));

        Circulo circulo = new Circulo(1, 2);
        circulo.setRaio(3.0);
        System.out.println(circulo);
        System.out.println(circulo.getRaio());
        System.out.println(circulo.calculaArea(circulo.getRaio()));
        System.out.println(circulo.calculaPerimetro(circulo.getRaio()));

        Retangulo retangulo = new Retangulo( 1, 3.0, 2.0);
        retangulo.setLado(3.0);
        retangulo.setAltura(5.0);
        System.out.println(retangulo);
        System.out.println(retangulo.getAltura() + " " + retangulo.getLado());
        System.out.println("Área do retangulo: " + retangulo.calculaArea(retangulo.getLado(), retangulo.getAltura()));
        System.out.println("Perímetro do retangulo: " + retangulo.calculaPerimetro(retangulo.getLado(), retangulo.getAltura()));

        /*Collection List */
        List<Circulo> circulos = new ArrayList<>();
        circulos.add(circulo);
        System.out.println(circulos);
        Circulo circulo2 = new Circulo();
        circulo2.setId(2);
        circulo2.setRaio(3.0);
        circulos.add(circulo2);
        System.out.println(circulos);
        System.out.println("Objetos circulos sao iguais:");;
        System.out.println(circulo.equals(circulo2));
        System.out.println(" " + circulo.equals(circulo));
        System.out.println(circulos.get(0) + " " + circulos.get(1));

        for (Circulo c : circulos){ //For each do java
            System.out.println(c);
        }

        /* Collection Map */

        Map<Integer, Circulo> circulosMap = new HashMap<>();
        circulosMap.put(circulo.hashCode(), circulo);
        circulosMap.put(circulo2.hashCode(), circulo2);
        System.out.println(circulosMap);

        System.out.println(circulosMap.get(circulo2.hashCode()));

    }
}

/*
- Tipos primitivos
    tipos estilo c, letras começam com letra minuscula, retornam 0

- Tipos Programador
    tipos padrões do java, String, Integer, Double, retornam null
 */
