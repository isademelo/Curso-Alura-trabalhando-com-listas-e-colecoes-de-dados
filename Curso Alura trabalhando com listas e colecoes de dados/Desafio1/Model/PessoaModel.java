package DesafioHoraDaPratica.Desafio1.Model;

public class PessoaModel {
    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
