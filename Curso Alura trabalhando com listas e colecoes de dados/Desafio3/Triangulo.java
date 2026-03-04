package DesafioHoraDaPratica.Desafio3;

public class Triangulo implements Forma {
    @Override
    public void calcularArea() {
        int b = 90;
        int h = 150;
        double area = (b * h)/2;
        System.out.println(String.format("A área do triângulo é %.2f cm²", area));
    }
}
