package reset.modulojava.aulas;

import java.util.Scanner;

public class LoopsDoWhileFor34 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Exercício 3
        /*
        int numeros;
        int maior = Integer.MIN_VALUE; // Menor valor existente (cursor no MIN mostra qual é);

        for (int i = 0; i < 5; i++){
            System.out.print("Informe um número: ");
            numeros = scan.nextInt();

            if(numeros > maior) { // Começa substituindo o primeiro;
                maior = numeros; // Vai substituindo pelos maiores;
            }
        }

        System.out.print("O maior número é: " + maior);
        */
        // Exercício 4

        System.out.print("Informe um número de 1 a 10 para gerar a tabuada: ");
        int numero = scan.nextInt();

        while(numero > 10 || numero <= 0){
            System.out.print("Precisa ser de 1 a 10, tente de novo: ");
            numero = scan.nextInt();
        }

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++){
            int mult = numero * i;
            System.out.println(numero + " x " + i + " = " + mult);
        }

    }
}
