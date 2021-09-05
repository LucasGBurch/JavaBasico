package reset.modulojava.aulas;

import java.util.Scanner;

public class CondicionaisSwitch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de um dia da semana (de 1 a 7): ");
        int dia = scan.nextInt();

        switch (dia){
            case 1: System.out.print("O dia é domingo!");
                break;
            case 2: System.out.print("O dia é segunda-feira!");
                break;
            case 3: System.out.print("O dia é terça-feira!");
                break;
            case 4: System.out.print("O dia é quarta-feira!");
                break;
            case 5: System.out.print("O dia é quinta-feira!");
                break;
            case 6: System.out.print("O dia é sexta-feira!");
                break;
            case 7: System.out.print("O dia é sábado!");
                break;
            default: System.out.print("Valor inválido!");
        }
    }
}
