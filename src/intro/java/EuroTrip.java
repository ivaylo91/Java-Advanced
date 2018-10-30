package intro.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double quantity = input.nextDouble();
        double priceInBGN = quantity * 1.20;

        BigDecimal dm = new BigDecimal("4210500000000");
        BigDecimal priceBGN = new BigDecimal(priceInBGN);

        System.out.printf("%.2f mark", priceBGN.multiply(dm));
    }
}
