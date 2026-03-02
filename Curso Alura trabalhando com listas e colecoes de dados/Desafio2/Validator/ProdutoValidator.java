package DesafioHoraDaPratica.Desafio2.Validator;
import DesafioHoraDaPratica.Desafio2.Controller.ControladorPrincipalController;
import DesafioHoraDaPratica.Desafio2.View.SistemaView;

public class ProdutoValidator {

    public static int verificarQuantidade(int quantidade){
        while (quantidade <= 0){
            System.out.println(SistemaView.getDigiteUmaQuantidadeValida());
            quantidade = ControladorPrincipalController.entrada.nextInt();
        }
        return quantidade;
    }

    public static String verificarNome (String nome) {
        while (nome.isEmpty()){
            System.out.println(SistemaView.getDigiteUmNomeValido());
            nome = ControladorPrincipalController.entrada.nextLine();
        }
        return nome;
    }

    public static double verificarPreco (double preco){
        while (preco <= 0){
            System.out.println(SistemaView.getDigiteUmPrecoValido());
            preco = ControladorPrincipalController.entrada.nextDouble();
        }
        return preco;
    }
}
