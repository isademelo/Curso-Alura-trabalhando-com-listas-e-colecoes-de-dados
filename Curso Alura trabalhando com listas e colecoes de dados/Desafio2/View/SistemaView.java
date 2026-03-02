package DesafioHoraDaPratica.Desafio2.View;

public class SistemaView {
    private static String  DIGITE_NOME = "Digite o nome do produto";
    private static String DIGITE_PRECO = "Digite o preço do produto";
    private static String DIGITE_QUANTIDADE = "Digite a quantidade do produto";
    private static String VOCE_QUER_ADICIONAR_MAIS_ITEM = "Você deseja adicionar mais algum item? (S/N)";
    private static String DIGITE_UMA_QUANTIDADE_VALIDA = "Digite uma quantidade válida: ";
    private static String DIGITE_UM_NOME_VALIDO = "Digite um nome válido: ";
    private static String DIGITE_UM_PRECO_VALIDO = "Digite um preço válido: ";

    public static String getDigiteUmPrecoValido() {
        return DIGITE_UM_PRECO_VALIDO;
    }

    public static String getDigiteUmNomeValido() {
        return DIGITE_UM_NOME_VALIDO;
    }

    public static String getDigiteUmaQuantidadeValida() {
        return DIGITE_UMA_QUANTIDADE_VALIDA;
    }

    public static String getVoceQuerAdicionarMaisItem() {
        return VOCE_QUER_ADICIONAR_MAIS_ITEM;
    }

    public static String getDIGITE_NOME() {
        return DIGITE_NOME;
    }

    public static String getDIGITE_PRECO() {
        return DIGITE_PRECO;
    }

    public static String getDIGITE_QUANTIDADE() {
        return DIGITE_QUANTIDADE;
    }
}
