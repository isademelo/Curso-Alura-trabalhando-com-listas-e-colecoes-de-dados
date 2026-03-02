package DesafioHoraDaPratica.Desafio1.Repository;
import DesafioHoraDaPratica.Desafio1.Model.PessoaModel;
import DesafioHoraDaPratica.Desafio1.View.PessoaView;

import java.util.ArrayList;

public class ListaDePessoasRepository {
    private static ArrayList<PessoaModel> listaDePessoas = new ArrayList<PessoaModel>();

    public static void adicionarPessoa(PessoaModel pessoaQueVaiSerAdicionada){
        listaDePessoas.add(pessoaQueVaiSerAdicionada);
    }

    public static int printarTamanhoDaLista(){
        return listaDePessoas.size();
    }

    public static ArrayList<PessoaModel> getListaDePessoas() {
        return listaDePessoas;
    }

    public static String imprimirPrimeiraPessoaDaLista(){
        return PessoaView.printarPrimeiroItemDaListaFormatado(listaDePessoas.get(0).getNome(), listaDePessoas.get(0).getIdade());
    }
}
