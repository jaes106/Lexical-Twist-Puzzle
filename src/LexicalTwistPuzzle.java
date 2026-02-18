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
            System.out.println("Reverse match found");
        } else {
            System.out.println("Not a reverse match");
        }
    }
}
