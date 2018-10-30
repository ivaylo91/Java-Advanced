package intro.java;

import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstWord = input.next();
        String secondWord = input.next();
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        input.nextLine();
        String thirdWord = input.nextLine();

        int sum = num1 + num2 + num3;

        System.out.println(firstWord + " " + secondWord + " " + thirdWord + " " + sum);
    }
}
