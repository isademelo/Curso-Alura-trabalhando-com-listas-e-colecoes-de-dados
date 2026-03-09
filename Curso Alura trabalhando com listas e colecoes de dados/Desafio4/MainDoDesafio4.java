package DesafioHoraDaPratica.Desafio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainDoDesafio4 {
    public static void main(String[] args) {
        //Crie uma lista de números inteiros e utilize o metodo Collections.sort para ordená-la em ordem crescente.
        // Em seguida, imprima a lista ordenada.
        List<Integer> numerosInteiros = new ArrayList<>();

        numerosInteiros.add(2);
        numerosInteiros.add(8);
        numerosInteiros.add(4);
        numerosInteiros.add(12);
        numerosInteiros.add(3);
        numerosInteiros.add(6);

        Collections.sort(numerosInteiros);
        System.out.println(numerosInteiros);

        //Crie uma classe Titulo com um atributo nome do tipo String.
        // Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.
        // No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista.
        // Utilize o metodo Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
        List<Titulo> titulos = new ArrayList<>();

        Titulo titulo1 = new Titulo("Batman");
        Titulo titulo2 = new Titulo("Superman");
        Titulo titulo3 = new Titulo("Homem aranha");

        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);

        Collections.sort(titulos);

        for (Titulo titulo : titulos) {
            System.out.println(titulo);
        }

        //Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
        // Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
        //Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.

        List <String> nomes = new ArrayList<>();

        nomes.add("E5");
        nomes.add("C3");
        nomes.add("A2");
        nomes.add("D4");
        nomes.add("A1");

        System.out.println("Lista sem ordenação: " + nomes);
        Collections.sort(nomes);
        System.out.println("Lista com ordenação: " + nomes);

        List <String> listaEncadeada = new LinkedList<>(nomes);
        System.out.println("Lista encadeada: " + listaEncadeada);
    }
}
