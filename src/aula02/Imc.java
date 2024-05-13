package aula02;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        short peso = leitor.nextShort();

        System.out.print("Digite a sua altura: ");
        double altura = leitor.nextDouble();

        double imc = peso/(altura*altura);

        System.out.println(imc);
        if (imc < 18.5) {
            System.out.println("Você esta abaixo do peso ideal");
        } else if (imc > 18.5 && imc <= 25) {
            System.out.printf("Você esta no peso ideal ");
        } else if (imc > 25.0 && imc <= 30) {
            System.out.println("Você esta levemente acima do peso");
        } else if (imc > 30 && imc <=35) {
            System.out.println("Você esta com obesidade grau 1");
        } else if (imc > 35 && imc <=40) {
            System.out.println("Você esta com obesidade grau 2");
        } else if (imc > 40) {
            System.out.println("Você esta com obesidade grau 3");
        }
    }
}
