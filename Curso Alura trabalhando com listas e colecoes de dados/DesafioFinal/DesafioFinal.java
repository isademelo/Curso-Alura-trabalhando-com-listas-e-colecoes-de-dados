package DesafioFinal;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Random;
import java.util.Scanner;

public class DesafioFinal {
    public static void main (String [] args){
        Random geradorDeId = new Random();
        Scanner entrada = new Scanner(System.in);
        double limiteCartao = 0;
        boolean valorValido = false;

            System.out.println("Digite o limite do cartão: ");

            do {
                try {
                    limiteCartao = entrada.nextDouble();
                    if (limiteCartao < 0.1){
                        System.out.println("O valor tem que ser maior que zero");
                    } else {
                        valorValido = true;
                    }
                } catch (Exception e) {
                    System.out.println("Digite um valor numérico, tente novamente: ");
                    entrada.next();
                }
            } while (!valorValido);

            CartaoDeCredito cartao = new CartaoDeCredito(limiteCartao);

        boolean repetir =  false;

        do {
            entrada.nextLine();
            System.out.println("Digite a descrição da compra");
            String descricao = entrada.nextLine();

            while (descricao.isEmpty()){
                System.out.println("O campo nao pode estar em branco...");
                descricao = entrada.nextLine();
            }

            System.out.println("Digite o valor da compra: ");
            double valorDaCompra;
            boolean valorDeCompraValido = false;

            do{
                try {
                    valorDaCompra= entrada.nextDouble();
                    if (valorDaCompra < 0.1){
                        System.out.println("O valor tem que ser maior que zero");
                    } else {
                        if (cartao.realizarCompra(valorDaCompra)) {
                            valorDeCompraValido = true;
                            ZonedDateTime horarioDaCompra = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
                            int id = 100000 + geradorDeId.nextInt(900000);
                            Compra compra = new Compra(descricao, valorDaCompra, horarioDaCompra, id);
                            Compra.adicionarCompraAoHistorico(compra);
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Digite um valor numérico, tente novamente: ");
                    entrada.next();
                }
            } while (!valorDeCompraValido);

            System.out.println("Você deseja continuar a execução do programa? (DIGITE 0 OU 1)");
            byte continuar;

            boolean entradaValida = false;

            do {
                try {
                    continuar = entrada.nextByte();
                    if (continuar != 0 && continuar != 1){
                        System.out.println("Digite um valor válido, 0 (ZERO) ou  1 (UM)");
                    } else {
                        entradaValida = true;
                        repetir = (continuar == 1);
                    }
                } catch (Exception e) {
                    System.out.println("Digite um valor numérico, tente novamente: ");
                    entrada.next();
                }
            } while (!entradaValida);
        } while (repetir == true);

        Compra.vizualizarHistoricoDeCompras();
        System.out.println("""
                Saldo do seu cartão: R$ %.2f
                Limite do seu cartão: R$ %.2f
                """.formatted(cartao.getSaldo(), cartao.getLimite()));
    }
}
