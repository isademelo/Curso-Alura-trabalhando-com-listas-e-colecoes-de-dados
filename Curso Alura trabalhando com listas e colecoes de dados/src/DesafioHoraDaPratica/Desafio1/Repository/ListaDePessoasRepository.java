package DesafioHoraDaPratica.Desafio1.Repository;
import DesafioHoraDaPratica.Desafio1.Model.Pessoa;
import DesafioHoraDaPratica.Desafio1.View.PessoaView;

import java.util.ArrayList;

public class ListaDePessoasRepository {
    private static ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();

    public static void adicionarPessoa(Pessoa pessoaQueVaiSerAdicionada){
        listaDePessoas.add(pessoaQueVaiSerAdicionada);
    }

    public static int printarTamanhoDaLista(){
        return listaDePessoas.size();
    }

    public static ArrayList<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }

    public static String imprimirPrimeiraPessoaDaLista(){
        return PessoaView.printarPrimeiroItemDaListaFormatado(listaDePessoas.get(0).getNome(), listaDePessoas.get(0).getIdade());
    }
}
