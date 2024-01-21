import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        String word = scanner.next();

        int count = countOccurrences2(sentence, word);

        System.out.println("Number of occurrences of \"" + word + "\": " + count);
    }
//way2 by reblace
    static int countOccurrences2(String sentence, String word) {
       
        String modifiedSentence = sentence.replaceAll(" " + word, "");
        int count = (sentence.length() - modifiedSentence.length()) / word.length();

        return count;
    }
}

