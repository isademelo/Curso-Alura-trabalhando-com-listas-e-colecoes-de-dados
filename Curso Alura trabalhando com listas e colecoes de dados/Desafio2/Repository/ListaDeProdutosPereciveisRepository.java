package DesafioHoraDaPratica.Desafio2.Repository;

import DesafioHoraDaPratica.Desafio2.Model.ProdutoModel;

import java.util.ArrayList;

public class ListaDeProdutosPereciveisRepository extends ListaDeProdutosRepository{
    private static ArrayList<ProdutoModel> listaDeProdutosPereciveis = new ArrayList<>();

    public static void imprimirTodaAListaProdutosPereciveis (){
        for (ProdutoModel p : listaDeProdutosPereciveis){
            System.out.println(p.toString());
        }
    }

    public static void adicionarProdutoPerecivel (ProdutoModel produto){
        listaDeProdutosPereciveis.add(produto);
    }
}
