package DesafioFinal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    private String descricao;
    private double valor;
    private ZonedDateTime horarioDaCompra;
    private int id;

    static List <Compra> compras = new ArrayList<>();

    public static void adicionarCompraAoHistorico (Compra compra) {
        compras.add(compra);
    }

    public static void vizualizarHistoricoDeCompras (){
        System.out.println("""
                    --------------------------------------------
                                HISTÓRICO DE COMPRAS
                    --------------------------------------------""");
        int i = 0;
        for (Compra compra : compras){
            i++;
            System.out.println("""
                    ID da compra: %d
                    Compra nº: %d
                    Descrição: %s
                    Valor: R$ %.2f
                    Horario da compra: %s
                    """.formatted(compra.id, i, compra.descricao, compra.valor, compra.horarioDaCompra));
        }
    }



    public Compra(String descricao, double valor, ZonedDateTime horarioDaCompra, int id) {
        this.descricao = descricao;
        this.valor = valor;
        this.horarioDaCompra = horarioDaCompra;
        this.id = id;
    }
}
