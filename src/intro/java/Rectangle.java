package intro.java;

import java.util.Scanner;

public class Rectangle {

    static double calcArea(double a, double b) {

        return a * b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.printf("%.2f", calcArea(a, b));
    }
}
