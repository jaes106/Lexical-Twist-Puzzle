import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lexical Twist Puzzle");

        System.out.println("Enter the first word:");
        String firstWord = sc.nextLine();

        System.out.println("Enter the second word:");
        String secondWord = sc.nextLine();

        if (firstWord.contains(" ") || secondWord.contains(" ")) {
            System.out.println("Invalid word input");
            return;
        }

        String reversed = new StringBuilder(firstWord)
                .reverse()
                .toString();

        if (reversed.equalsIgnoreCase(secondWord)) {

            String transformed = reversed
                    .toLowerCase()
                    .replaceAll("[aeiou]", "@");

            System.out.println(transformed);

        } else {

            String combined = (firstWord + secondWord).toUpperCase();

            int vowels = 0;
            int consonants = 0;

            for (char c : combined.toCharArray()) {
                if ("AEIOU".indexOf(c) != -1)
                    vowels++;
                else if (Character.isLetter(c))
                    consonants++;
            }

            if (vowels > consonants) {
                printUnique(combined, true);
            } else if (consonants > vowels) {
                printUnique(combined, false);
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }

    static void printUnique(String text, boolean vowelMode) {
        String result = "";

        for (char c : text.toCharArray()) {
            boolean isVowel = "AEIOU".indexOf(c) != -1;

            if ((vowelMode && isVowel) ||
                    (!vowelMode && !isVowel && Character.isLetter(c))) {

                if (result.indexOf(c) == -1) {
                    result += c;
                }
            }

            if (result.length() == 2)
                break;
        }

        System.out.println(result);
    }
}
