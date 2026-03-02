package DesafioHoraDaPratica.Desafio2.Controller;
import DesafioHoraDaPratica.Desafio2.Model.ProdutoModel;
import DesafioHoraDaPratica.Desafio2.Model.ProdutoPerecivelModel;
import DesafioHoraDaPratica.Desafio2.Repository.ListaDeProdutosPereciveisRepository;
import DesafioHoraDaPratica.Desafio2.Repository.ListaDeProdutosRepository;
import DesafioHoraDaPratica.Desafio2.Validator.ProdutoValidator;
import DesafioHoraDaPratica.Desafio2.View.SistemaView;

import java.util.Scanner;
public class ControladorPrincipalController {
    public static  Scanner entrada = new Scanner(System.in);

    public static void controladorPrincipal (){
        boolean adicionarMaisProdutos = false;

        do {
            System.out.println(SistemaView.getDIGITE_NOME());
            String nome = entrada.nextLine().trim();
            nome = ProdutoValidator.verificarNome(nome);

            System.out.println(SistemaView.getDIGITE_PRECO());
            double preco = Double.parseDouble(entrada.nextLine());
            preco = ProdutoValidator.verificarPreco(preco);

            System.out.println(SistemaView.getDIGITE_QUANTIDADE());
            int quantidade = Integer.parseInt(entrada.nextLine());
            quantidade = ProdutoValidator.verificarQuantidade(quantidade);

            ProdutoModel produto  = new ProdutoModel(nome, preco, quantidade);
            ListaDeProdutosRepository.adicionarProduto(produto);

            System.out.println(SistemaView.getVoceQuerAdicionarMaisItem());
            char confirmar =  entrada.next().toUpperCase().charAt(0);
            entrada.nextLine();

                if (confirmar == 'S'){
                    adicionarMaisProdutos = true;
                } else {
                    adicionarMaisProdutos = false;
                }

        } while (adicionarMaisProdutos == true);
        ListaDeProdutosRepository.imprimirTodaALista();

// essa linha do produto perecível foi só para fazer um teste ==> Crie uma classe ProdutoPerecivel que herde de Produto.
// Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados.
// Crie um objeto ProdutoPerecivel e imprima seus valores.

        ProdutoPerecivelModel produtoPerecivel = new ProdutoPerecivelModel("sla", 19, 20, "21/12/26");
        ListaDeProdutosPereciveisRepository.adicionarProduto(produtoPerecivel);
        ListaDeProdutosPereciveisRepository.imprimirTodaALista();
    }
}
