package reset.modulojava.aulas;

import java.util.Scanner;

public class LoopsDoWhileFor12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Exercício 1: na correção tinha do{}while(!notaValida), invalida no else!
        /*
        System.out.print("Informe uma nota entre 0 e 10: ");
        double nota = scan.nextDouble();

        while(nota > 10 || nota < 0){
            System.out.print("Valor da nota precisa estar entre 0 e 10: ");
            nota = scan.nextDouble();
        }
        if(nota <= 10 && nota >= 0){
            System.out.print("Valor da nota informada: " + nota);
        } */

        // Exercício 2:
        System.out.print("Digite um número: ");
        int primeiroNumero = scan.nextInt();
        System.out.print("Digite um número maior que o primeiro: ");
        int segundoNumero = scan.nextInt();

        while(segundoNumero <= primeiroNumero){
            System.out.print("O segundo precisa ser maior que o primeiro: ");
            segundoNumero = scan.nextInt();
        }

        for (int i = primeiroNumero, j = segundoNumero; i <= j; i++){
            System.out.println(i);
        }

    }
}
