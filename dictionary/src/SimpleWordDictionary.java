import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleWordDictionary {
    private Map<Character, List<String>> wordsMap;

    public SimpleWordDictionary() {
        // Create a map with alphabets as keys and an ArrayList as values
        this.wordsMap = new TreeMap<>();
    }

    public void insert(Collection<String> words) {
        for (String word : words) {
            addWord(word);
        }
    }

    public boolean addWord(String word) {
        // Check if the first character is a letter
        char firstChar = word.charAt(0);
        if (!Character.isLetter(firstChar)) {
            System.out.println("Invalid word: " + word + ". The first character must be a letter.");
            return false;
        }

        char key = Character.toLowerCase(firstChar);

        List<String> wordsList = wordsMap.computeIfAbsent(key, k -> new ArrayList<>());
        if (!wordsList.contains(word)) {
            wordsList.add(word);
            wordsList.sort(String::compareTo);
            return true;
        }
        return false;
    }
    public boolean removeWord(String word) {
        // Remove a specific word from the dictionary
        char key = Character.toLowerCase(word.charAt(0));
        List<String> wordsList = wordsMap.get(key);
        if (wordsList != null) {
            boolean removed = wordsList.remove(word);
            if (removed && wordsList.isEmpty()) {
                wordsMap.remove(key);
            }
            return removed;
        }
        return false;
    }

    public void removeAllKey(char key) {
        // Remove all words corresponding to a given key
        char lowerKey = Character.toLowerCase(key);
        wordsMap.remove(lowerKey);
    }

 
public void searchForLetterInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char targetLetter = input.toLowerCase().charAt(0); // Convert to lowercase for case-insensitivity
            searchWithPattern(targetLetter);
        } else {
            System.out.println("Invalid input. Please enter a single letter.");
        }
    }

    private void searchWithPattern(char targetLetter) {
        // Generate regex pattern to find words containing the specified letter (case-insensitive)
        String regexPattern = ".*" + Pattern.quote(String.valueOf(targetLetter)) + ".*";

        Pattern pattern = Pattern.compile(regexPattern, Pattern.CASE_INSENSITIVE);

        for (Map.Entry<Character, List<String>> entry : wordsMap.entrySet()) {
            List<String> words = entry.getValue();
            for (String word : words) {
                Matcher matcher = pattern.matcher(word);
                if (matcher.find()) {
                    System.out.println(word);
                }
            }
        }
    }





    public void printDictionary() {
        // Print all letters and corresponding words (up to 3 words)
        for (Map.Entry<Character, List<String>> entry : wordsMap.entrySet()) {
            char key = entry.getKey();
            List<String> words = entry.getValue();
            System.out.println(key + ": " + String.join(", ", words));
        }
    }

    public void getWords(char key) {
        // Print up to 3 words of a given letter
        char lowerKey = Character.toLowerCase(key);
        List<String> words = wordsMap.get(lowerKey);
        if (words != null) {
            System.out.println(key + ": " + String.join(", ", words));
        } else {
            System.out.println("No words found for the letter " + Character.toUpperCase(key) + ".");
        }
    }}