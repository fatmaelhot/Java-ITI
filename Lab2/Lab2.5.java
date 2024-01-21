import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        String word = scanner.next();

        int count = countOccurrencesWithRegex(sentence, word);

        System.out.println("Number of occurrences of \"" + word + "\": " + count);
    }

    static int countOccurrencesWithRegex(String sentence, String word) {
        // Escape special characters in the target word
        String escapedWord = Pattern.quote(word);

        // Create a regex pattern for the target word as a whole word
        Pattern pattern = Pattern.compile("\\b" + escapedWord + "\\b", Pattern.CASE_INSENSITIVE);

        // Create a matcher for the input string
        Matcher matcher = pattern.matcher(sentence);

        // Count occurrences using find() method
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}

