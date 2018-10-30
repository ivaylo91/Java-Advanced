package intro.java;

import java.util.Scanner;

public class CalculateExpression {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double result1 = Math.pow((Math.pow(num1, 2) + Math.pow(num2, 2)) / (Math.pow(num1, 2) - Math.pow(num2, 2)), (num1 + num2 + num3) / Math.sqrt(num3));


        double result2 = Math.pow(Math.pow(num1, 2) + Math.pow(num2, 2) - Math.pow(num3, 3), num1 - num2);


        double averageOfNumbers = (num1 + num2 + num3) / 3;
        double averageOfResults = (result1 + result2) / 2;

        double diff = Math.abs(averageOfNumbers - averageOfResults);

        System.out.printf("F1 result: %.2f F2 result: %.2f  Diff: %.2f ", result1, result2, diff);
    }
}
