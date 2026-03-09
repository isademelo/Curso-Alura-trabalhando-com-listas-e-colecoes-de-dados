package DesafioHoraDaPratica.Desafio4;

public class Titulo implements Comparable<Titulo> {

    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.nome.compareToIgnoreCase(titulo.nome);
    }

    @Override
    public String toString() {
        return "{nome: " + nome + "}";
    }
}