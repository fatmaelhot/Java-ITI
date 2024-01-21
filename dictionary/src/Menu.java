import java.util.*;

public class Menu {
    private SimpleWordDictionary dictionary;

    public Menu() {
        this.dictionary = new SimpleWordDictionary();
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);

         while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert Words");
            System.out.println("2. Remove Word");
            System.out.println("3. Remove All Words for a Key");
            System.out.println("4. Search Words by Regex Pattern");
            System.out.println("5. Print Dictionary");
            System.out.println("6. Get Words for a Key");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter words : ");
                    String wordsInput = scanner.nextLine();
                    List<String> wordsList = Arrays.asList(wordsInput.split(",\\s*"));
                    dictionary.insert(wordsList);
                    break;
                case 2:
                    System.out.print("Enter word to remove: ");
                    String wordToRemove = scanner.nextLine();
                    boolean removed = dictionary.removeWord(wordToRemove);
                    if (removed) {
                        System.out.println("Word removed successfully.");
                    } else {
                        System.out.println("Word not found in the dictionary.");
                    }
                    break;
                case 3:
                    System.out.print("Enter key to remove all words: ");
                    char keyToRemove = scanner.next().charAt(0);
                    dictionary.removeAllKey(keyToRemove);
                    System.out.println("All words for the key removed.");
                    break;
                case 4:
                   // System.out.print("Enter regex pattern to search: ");
                   // String regexPattern = scanner.nextLine();
                   // System.out.println("Matching words:");
                    dictionary.searchForLetterInput();
                    break;
                case 5:
                    System.out.println("Dictionary:");
                    dictionary.printDictionary();
                    break;
                case 6:
                    System.out.print("Enter key to get words: ");
                    char keyToGet = scanner.next().charAt(0);
                    dictionary.getWords(keyToGet);
                    break;
                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }


    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.runMenu();
    }
}
