package DesafioHoraDaPratica.Desafio3;

public class Quadrado implements Forma {
    @Override
    public void calcularArea() {
        int lado = 40;
        int areaDoQuadrado = lado * lado;
        System.out.println(String.format("A área do quadrado é: %d cm²", areaDoQuadrado));
    }
}
