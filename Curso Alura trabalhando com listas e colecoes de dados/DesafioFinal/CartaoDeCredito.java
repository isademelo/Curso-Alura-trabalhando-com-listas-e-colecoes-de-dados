package DesafioFinal;

public class CartaoDeCredito {
    private double limite;
    private double saldo;



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public boolean realizarCompra(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
