package DesafioHoraDaPratica.Desafio1.View;
import DesafioHoraDaPratica.Desafio1.Model.PessoaModel;

public class PessoaView {
    private static String DIGITAR_NOME_DA_PESSOA = "Digite o nome da pessoa: ";
    private static String DIGITAR_IDADE_DA_PESSOA = "Digite a idade da pessoa: ";
    private static String PRINTANDO_TODA_A_LISTA = "Printando toda a lista: ";
    private static String PRINTANDO_TAMANHO_DA_LISTA = "O tamanho da lista é: ";

    public static String getPrintandoTamanhoDaLista() {
        return PRINTANDO_TAMANHO_DA_LISTA;
    }

    public static String printarPrimeiroItemDaListaFormatado (String nome, int idade){
        return ("Primeiro item da lista -> Nome: " + nome + " ,idade: " + idade);
    }

    public static String getPrintandoTodaALista() {
        return PRINTANDO_TODA_A_LISTA;
    }

    public static String getDigitarIdadeDaPessoa() {
        return DIGITAR_IDADE_DA_PESSOA;
    }

    public static String getDigitarNomeDaPessoa() {
        return DIGITAR_NOME_DA_PESSOA;
    }

    public static String printarFormatadoComToString (PessoaModel pessoa, byte i){
        return ("Pessoa " + i + " - Nome: " + pessoa.getNome() + " idade" + pessoa.getIdade());
    }
}
