package reset.modulojava.aulas;

public class Teste {

    public static void main(String[] args) {
        //int i = 2;
        //int j = 4;
        //int k = 6;

       // i += ++j - k--;
       // k *= i++ + i * j; // 62

        //j = j + 1;
        //i = i + j - k;
        //k = k - 1;
        //k = k * (i + (i+1) * j);
        //i = i + 1;

        //System.out.print(i + k + j);

        for (int num = 0; num < 4; num++) {
            if (num == 2){
                continue; // Continue manda o for continuar, PULANDO A IMPRESSÃO DO 2!!!
            }
            System.out.println(num);
        }
    }
}
