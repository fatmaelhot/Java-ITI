
package lambda;

import java.util.function.BiPredicate;

public class Lambda {
    public static boolean containsOnlyAlphabets(String input) {
        return input.chars().allMatch(Character::isLetter);
    }

    public static String betterString
        (String string1, String string2, BiPredicate<String, String> betterStringLambda) {
        return betterStringLambda.test(string1, string2) ? string1 : string2;
    }

    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";

        // Example 1: Return the longer string
        String longer = betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("Longer String: " + longer);

        // Example 2: Return the first string always
        String first = betterString(string1, string2, (s1, s2) -> true);
        System.out.println("First String: " + first);

        // Example 3: Check if a string contains only alphabets
        String strToCheck = "AbcDef";
        System.out.println("Contains only alphabets: " + containsOnlyAlphabets(strToCheck));
    }
}
