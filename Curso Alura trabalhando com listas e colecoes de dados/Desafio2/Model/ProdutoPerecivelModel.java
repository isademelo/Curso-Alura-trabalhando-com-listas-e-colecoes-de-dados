package DesafioHoraDaPratica.Desafio2.Model;

public class ProdutoPerecivelModel extends ProdutoModel{
    private String dataDeValidade;

    public ProdutoPerecivelModel(String nome, double preco, int quantidade, String dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Validade: %s", dataDeValidade);
    }
}
