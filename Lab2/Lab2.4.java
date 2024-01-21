import java.util.StringTokenizer;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        String word = scanner.next();

        int count = countOccurrences(sentence, word);

        System.out.println("Number of occurrences of \"" + word + "\": " + count);
    }

    public static int countOccurrences(String str, String targetWord) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        StringTokenizer tokens = new StringTokenizer(str);
        int count = 0;

        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken();
            if (token.equalsIgnoreCase(targetWord)) {
                count++;
            }
        }

        return count;
    }
}

