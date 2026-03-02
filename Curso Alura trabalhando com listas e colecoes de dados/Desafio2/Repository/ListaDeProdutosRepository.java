package DesafioHoraDaPratica.Desafio2.Repository;

import DesafioHoraDaPratica.Desafio2.Model.ProdutoModel;

import java.util.ArrayList;

public class ListaDeProdutosRepository {
    private static ArrayList<ProdutoModel> listaDeProdutos = new ArrayList<>();

    public static void imprimirTodaALista (){
        for (ProdutoModel p : listaDeProdutos){
            System.out.println(p.toString());
        }
    }

    public static void adicionarProduto (ProdutoModel produto){
        listaDeProdutos.add(produto);
    }
}
