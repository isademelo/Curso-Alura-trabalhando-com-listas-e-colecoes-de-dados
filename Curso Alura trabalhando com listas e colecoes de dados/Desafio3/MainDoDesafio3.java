package DesafioHoraDaPratica.Desafio3;
import java.util.ArrayList;

public class MainDoDesafio3 {
    public static void main(String[] args) {

        //ATV 1 - Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
        ArrayList<String> lista = new ArrayList<>();
        lista.add("joao");
        lista.add("maria");
        lista.add("isadora");
        lista.add("ricardo");

        for (String item : lista) {
            System.out.println(item);
        }

        //ATV 2 - Crie uma classe Animal e uma classe Cachorro que herda de Animal.
        // Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
        Animal cachorroConvertido = new Cachorro();
        cachorroConvertido.euSou();

        //ATV 3 - Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.

        Animal animal =  new Animal();

        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
            animal.euSou();
        } else {
            animal.euSou();
        }

        //ATV 4 - Crie uma classe Produto com propriedades como nome e preço.
        // Em seguida, crie uma lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto = new Produto("Sabão em pó", 4.99);
        Produto produto2 = new Produto("Pão", 1.50);
        Produto produto3 = new Produto ("leite", 5.00);

        listaDeProdutos.add(produto);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        double valorTotal = 0;

        for (Produto produtoDaLista : listaDeProdutos) {
            valorTotal += produtoDaLista.getPreco();
        }

        double mediaDosPrecos = valorTotal / listaDeProdutos.size();

        System.out.println(String.format("A média de preços dos itens que tem na lista é: R$ %.2f", mediaDosPrecos));

        //Crie uma interface Forma com um metodo calcularArea(). Implemente a interface em duas classes, por exemplo, Circulo e Quadrado.
        // Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para calcular e imprimir a área de cada forma.

        ArrayList<Forma> listaDasFormas = new ArrayList<>();

        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        listaDasFormas.add(circulo);
        listaDasFormas.add(quadrado);
        listaDasFormas.add(triangulo);

        for (Forma item : listaDasFormas) {
            item.calcularArea();
        }
    }
}
