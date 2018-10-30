package intro.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class ProductOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int m = input.nextInt();
        BigDecimal product = new BigDecimal("1");
        for (int i = n; i < m + 1; i++) {
            product = product.multiply(new BigDecimal(i));
        }
        System.out.println(product);
    }

}
