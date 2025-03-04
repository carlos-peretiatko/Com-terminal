package reforco0403;

import java.util.Scanner;

public class ex12 {
    
    //Faça um método que calcule o perímetro e outro que calcule a área de um retângulo
    //passando a altura e largura como parâmetros
    //Retornar os valores calculados

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura, largura;

        System.out.println("Digite a altura do retângulo: ");
        altura = scanner.nextDouble();

        System.out.println("Digite a largura do retângulo: ");
        largura = scanner.nextDouble();

        System.out.println("O perímetro do retângulo é: " + perimetro(altura, largura));

        scanner.close();
    }

    public static double perimetro(double altura, double largura) {

        double perimetro = altura * largura;
        return perimetro;

    }

}
