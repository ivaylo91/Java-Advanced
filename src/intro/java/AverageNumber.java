package intro.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble();
        double thridNumber = input.nextDouble();

        double sum = firstNum + secondNum + thridNumber;

        double average = (sum / 3);

        double value = Double.parseDouble(new DecimalFormat("##.##").format(average));

        System.out.println(value);
    }
}
