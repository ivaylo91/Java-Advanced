package linear.structures;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {

            names[i] = input.nextLine();

        }

        int[] encryptedNames = new int[n];

        for (int i = 0; i < names.length; i++) {

            int currentNameSum = 0;

            String name = names[i];

            for (int j = 0; j < name.length(); j++) {

                char currentLetter = name.charAt(j);

                if (checkLetterIsVowel(currentLetter)) {

                    currentNameSum += currentLetter * name.length();
                } else {
                    currentNameSum += currentLetter / name.length();
                }
            }
            encryptedNames[i] = currentNameSum;
        }

        Arrays.sort(encryptedNames);

        printResult(encryptedNames);
    }

    private static boolean checkLetterIsVowel(char letter) {

        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u' };

        for (char vowel : vowels) {

            if (vowel == Character.toLowerCase(letter)) {

                return true;
            }
        }

        return false;
    }

    private static void printResult(int[] values) {
        for (int value : values) {

            System.out.println(value);
        }
    }
}
