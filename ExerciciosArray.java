package reset.modulojava.aulas;

import java.util.Scanner;

public class ExerciciosArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*

        // 1) Montando a primeira Array:


        int[] cincoValores = new int[5];
        int[] cincoValoresMult = new int[cincoValores.length];

        for (int i = 0; i < cincoValores.length; i++){
            System.out.print("Digite o valor " + (i + 1) + ": ");
            cincoValores[i] = scan.nextInt();
        }

        // Montando a segunda Array (valores da primeira x2):
        for (int i = 0; i < cincoValores.length; i++){
            cincoValoresMult[i] = (cincoValores[i] * 2);
        }

        // Imprimindo as duas Arrays:
        for (int valores: cincoValores){
            System.out.println(valores);
        }
        for (int valores: cincoValoresMult){
            System.out.println(valores);
        }
        */

        // 2) Vetor 10 idades, imprimir elas no fim com quantas são maiores de idade!!

        int[] idades = new int[10];
        int maiores = 0;

        for (int i = 0; i < idades.length; i++){
            System.out.print("Digite a idade " + (i + 1) + ": ");
            idades[i] = scan.nextInt();

            // Já aproveitei o mesmo for para fazer o contador de maiores:
            if(idades[i] >= 18){
                maiores++;
            }
        }

        System.out.println("Idades registradas:");
        for (int idade: idades) {
            System.out.println(idade);
        }
        System.out.println("------------------");
        System.out.println("Quantidade de maiores de idade: " + maiores);
    }
}
