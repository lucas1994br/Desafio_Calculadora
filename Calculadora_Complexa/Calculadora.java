package Desafio_Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha a operação: ");
            System.out.println("1.Adição ");
            System.out.println("2.Subtração");
            System.out.println("3.Multiplicação");
            System.out.println("4.Divisão");
            System.out.println("5.Sair");
            System.out.println("Digite a sua opção: ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double num1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = entrada.nextDouble();
                    System.out.println(" Resultado " + calculadora.adicionar(num1, num2));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();
                    System.out.println(" Resultado " + calculadora.subtrair(num1, num2));
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();
                    System.out.println(" Resultado " + calculadora.multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = entrada.nextDouble();
                    if (num2 != 0) {
                        System.out.println(" Resultado : " + calculadora.dividir(num1, num2));

                    } else {
                        System.out.println("Erro na divisão por zero!");
                    }
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Informação inválida");
            }
        }
        entrada.close();
    }

    public double adicionar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro. Divisão por zero!");
            return 0;
        }
        return a / b;
    }
}
