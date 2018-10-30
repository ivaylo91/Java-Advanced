package intro.java;

import java.util.Scanner;

public class TransportPrice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        input.nextLine();
        String timeOfDay = input.nextLine();
        double price = 0;

        if (timeOfDay.equals("day")) {
            price = 0.70 + 0.79 * distance;

            if (distance >= 20) {
                price = distance * 0.09;
            }
            if (distance >= 100) {
                price = distance * 0.06;
            }

            System.out.printf("%.2f", price);
        }

        if (timeOfDay.equals("night")) {
            price = 0.70 + 0.90 * distance;

            if (distance >= 20) {
                price = distance * 0.09;
            }
            if (distance >= 100) {
                price = distance * 0.06;
            }

            System.out.printf("%.2f", price);
        }

    }
}

