package DesafioHoraDaPratica.Desafio2.Model;

import DesafioHoraDaPratica.Desafio2.Controller.ControladorPrincipalController;
import DesafioHoraDaPratica.Desafio2.View.SistemaView;

public class ProdutoModel {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoModel(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s, Quantidade: %d, Preço: %.2f", this.nome, this.quantidade, this.preco);
    }
}
