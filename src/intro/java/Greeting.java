package intro.java;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String lastName = input.nextLine();

        if (firstName.isEmpty()) {

            firstName = "*****";
        }
        System.out.printf("Hello, %s %s !", firstName, lastName);
    }
}
