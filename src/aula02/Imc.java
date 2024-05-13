package aula02;

// Importando a biblioteca Scanner
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        //Criando o objeto scanner
        Scanner leitor = new Scanner(System.in);

        //Pegando dados e criando variaveis
        System.out.print("Digite seu peso: ");
        short peso = leitor.nextShort();

        System.out.print("Digite a sua altura: ");
        double altura = leitor.nextDouble();

        String classificacao = "";

        //Calculando o IMC
        double imc = peso/(altura*altura);


        //Decidinco o IMC do usuario
        if (imc < 18.5) {
            classificacao = "Peso ideal";
        } else if (imc > 18.5 && imc <= 25) {
            classificacao = "Peso ideal ";
        } else if (imc > 25.0 && imc <= 30) {
            classificacao = "Levemente acima do peso";
        } else if (imc > 30 && imc <=35) {
            classificacao = "Obesidade grau 1";
        } else if (imc > 35 && imc <=40){
            classificacao = "Obesidade grau 2";
        } else if (imc > 40) {
            classificacao = "Obesidade grau 3";
        }

        //Monstrado o resultado
        String mensagem = String.format("O resultado do IMC foi %.2f. A sua classificação é %s", imc, classificacao);
        System.out.println(mensagem);
    }
}
