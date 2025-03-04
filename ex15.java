package reforco0403;

import java.util.Scanner;

public class ex15 {
    
    //Faça um programa que diz se um número inserido está dentro de um limite imposto
    //pelo usuário

    //Por exemplo:

    //Usuário inseriu o limite máximo como 100.
    //Usuário inseriu o limite mínimo como 70.
    //Depois ele inseriu o número 80.
    //O retorno deve ser: 80 está nos limites impostos.


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Double limiteMin, limiteMax;
        Double num;

        System.out.println("Digite o limite mínimo: ");
        limiteMin = scanner.nextDouble();

        System.out.println("Digite o limite máximo: ");
        limiteMax = scanner.nextDouble();

        System.out.println("Digite o número: ");
        num = scanner.nextDouble();

        if(dentroLimite(limiteMin, limiteMax, num) == true){
            System.out.println(num + " está nos limites impostos.");
        } else {
            System.out.println(num + " não está nos limites impostos.");
        }

        scanner.close();
    }

    public static boolean dentroLimite(Double limiteMin, Double limiteMax, Double num){

        if(num >= limiteMin && num <= limiteMax){
            return true;
        } else {
            return false;
        }
    }

}
