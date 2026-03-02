package DesafioHoraDaPratica.Desafio1.Controller;
import DesafioHoraDaPratica.Desafio1.Model.PessoaModel;
import DesafioHoraDaPratica.Desafio1.Repository.ListaDePessoasRepository;
import DesafioHoraDaPratica.Desafio1.View.PessoaView;

import java.util.Scanner;

public class SistemaPrincipalController {
    public static void sistemaPrincipal (){
        Scanner entradaDeDados = new Scanner(System.in);
        do {
            PessoaModel pessoa = new PessoaModel();
            System.out.println(PessoaView.getDigitarNomeDaPessoa());
            String nomeDaPessoa = entradaDeDados.nextLine();
            pessoa.setNome(nomeDaPessoa);

            System.out.println(PessoaView.getDigitarIdadeDaPessoa());
            int idadeDaPessoa = entradaDeDados.nextInt();
            pessoa.setIdade(idadeDaPessoa);
            entradaDeDados.nextLine();

            ListaDePessoasRepository.adicionarPessoa(pessoa);
        } while (ListaDePessoasRepository.getListaDePessoas().size()!= 3);

        System.out.println(PessoaView.getPrintandoTodaALista() + ListaDePessoasRepository.getListaDePessoas());
        System.out.println(ListaDePessoasRepository.imprimirPrimeiraPessoaDaLista());
        System.out.println(PessoaView.getPrintandoTamanhoDaLista() + ListaDePessoasRepository.printarTamanhoDaLista());
    }
}
