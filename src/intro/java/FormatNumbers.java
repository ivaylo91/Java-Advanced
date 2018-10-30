package intro.java;

import java.util.Scanner;

public class FormatNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        String hex = Integer.toHexString(num1);
        String binary = Integer.toBinaryString(num1);

        System.out.printf("|%s  |0%s|     %.2f|%.3f", hex.toUpperCase(), binary, num2, num3);
    }
}
