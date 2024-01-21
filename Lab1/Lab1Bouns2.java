class Lab1 {
    public static void main(String[] args) {

        String originalString = args[0];
        //call fun reverse and save it in variable
        String reversedString = reverseString(originalString);

        // Displaying the original and reversed strings
        System.out.println(originalString);
        System.out.println(reversedString);
    }

    private static String reverseString(String str) {
        
        // Create a StringBuilder object with the given string
        StringBuilder stringBuilder = new StringBuilder(str);

        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}


