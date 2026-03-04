package DesafioHoraDaPratica.Desafio3;

public class Circulo implements Forma {
    @Override
    public void calcularArea() {
        int raio = 27;
        double areaDoCirculo = 3.14 * raio * raio;
        System.out.println(String.format("A área do circulo é: %.2f cm²", areaDoCirculo));
    }
}
