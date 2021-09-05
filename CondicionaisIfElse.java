package reset.modulojava.aulas;

import java.util.Scanner;

public class CondicionaisIfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = scan.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double terceiraNota = scan.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double quartaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if(media >= 7 && media < 10){
            System.out.print("Aluno aprovado! Média " + media + ".");
        } else if(media < 7) {
            System.out.print("Aluno reprovado! Média " + media + ".");
        } else if(media == 10) {
            System.out.print("Aluno aprovado com louvores! Média " + media + ".");
        }
    }
}
