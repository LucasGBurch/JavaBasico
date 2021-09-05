package reset.modulojava.aulas;

import java.util.Scanner;

public class Operadores {
    // Aritméticos (+, %...), Lógicos (==, <...) e Relacionais (&&, ||...)

    public static void main(String[] args) {
        /*Exercício 1: Faça um programa que tenha como entradas
        dois números e imprima a soma de ambos. Utilize a classe
        Scanner para obter as entradas */

        /*Scanner scan1 = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scan1.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scan1.nextDouble();

        double soma = numero1 + numero2;
        System.out.print("A soma dos dois números é " + soma + ".");
        */

        /*Exercício 2: Faça um programa que tenha como entradas 4 notas e
        imprima a média. Utilize a classe Scanner para obter as entradas. */

        /*Scanner scan2 = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scan2.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scan2.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scan2.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scan2.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("A média das quatro notas é: " + media); */

        /*Exercício 3: Faça um programa que solicite quanto você ganha
         por hora e o número de horas trabalhadas no mês.
         Calcule e mostre o total do seu salário no referido mês. */

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Informe quanto você ganha por hora: ");
        double ganhoHora = scan3.nextDouble();

        System.out.print("Quantas horas você trabalhou no mês? ");
        int horasTrabalhadas = scan3.nextInt();

        double salarioTotal = ganhoHora * horasTrabalhadas;

        System.out.print("O seu salário total no referido mês é de R$"
                + salarioTotal + ".");
    }
}
