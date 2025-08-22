package view;

import controller.Sum;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Sum sm = new Sum();
        Scanner in = new Scanner(System.in);
        int input = 0;

        while (true) {
            System.out.println("Insira um número;");
            input = in.nextInt();
            if (input > 0) {
                System.out.println("O valor N é " + input);
                in.close();
                break;
            }
            System.out.println("Valor inválido N > 0");
        }

        System.out.println("O valor da soma é: " + sm.calc(input));
    }
}
