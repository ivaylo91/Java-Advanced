package intro.java;

import java.util.Scanner;

public class ExtractBit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();

        System.out.println(n >> p);
    }
}
