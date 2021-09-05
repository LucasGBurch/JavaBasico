package reset.modulojava.aulas;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();

        /* .next pegaria só o primeiro nome escrito!
        --> .nextInt, por exemplo, só permitiria digitar um número do tipo int.
        --> .nextDouble já permite os tipos double e por aí vai... cuidar declaração! */

        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo "
                + nomeCompleto + ".");
    }
}
