import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        String word = scanner.next();

        int count = countOccurrences1(sentence, word);

        System.out.println("Number of occurrences of \"" + word + "\": " + count);
    }
//way1 split and length
    static int countOccurrences1(String sentence, String word) {
        
        String[] words = sentence.split(" ");

        
        int count = 0;

        for (int i=0; i<words.length;i++) {
            
            if (word.equalsIgnoreCase(words[i])) {
                count++;
            }
        }

        return count;
    }
}


