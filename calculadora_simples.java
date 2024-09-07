package Desafio_Calculadora;

import java.util.Scanner;

public class calculadora_simples {
    public static void main(String[] args) {
        double numero_1;
        double numero_2;

        String  operacao = "";
        int ajuste = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        operacao = entrada.nextLine();

        System.out.println("Digite um valor: ");
        numero_1 = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite um valor: ");
        numero_2 = Double.parseDouble(entrada.nextLine());

        if(operacao.equals("+")) {
            System.out.println("O resultado da adição é: " +(numero_1 + numero_2));
            ajuste++;
        }

        if(operacao.equals("-")) {
            System.out.println("O resultado da subtração é: " + (numero_1 - numero_2));
            ajuste++;
        }

        if(operacao.equals("*")) {
            System.out.println("O resultado da multiplicação é: " + (numero_1 * numero_2));
            ajuste++;
        }

        if(operacao.equals("/")){
            if (numero_2 !=0) {
                System.out.println("O resultado da multiplicação é: " + (numero_1 * numero_2));
                ajuste++;
            } else {
                System.out.println("Operação inválida, Tente novamente!");
            }
        }
    }
}