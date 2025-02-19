class TextAnalyzer {

    /**
     * Count the number of characters in a given string. Words are separated 
     */
    public static int countCharacters(String input){
        if(input == null) return 0;

        String noSpaces = input.replace(" ","");
        return noSpaces.length();
    }

    /**
     * Counts the number of words in a given string. Words are separated by one or more spaces.
     * 
     * @param input The string to count words in.
     * @return The number of words in the input string.
     */
    public static int countWords(String input){
        if(input == null || input.trim().isEmpty()) return 0;
        String[] words = input.trim().split("\\s+");

        return words.length;
    }

    /**
     * Counts the number of unique words in a given string. The words
     *
     * @param args input The string to analyze for unique words.
     * @return The number of unique words in the input string.
     */
    public static int countUniqueWords(String input){
        if(input == null || input.trim().isEmpty()) return 0;

        String[] words = input.toLowerCase().trim().split("\\s+");
        return (int) java.util.Arrays.stream(words).distinct().count();
    }


    /**
     * Main method to demonstrate the analyzed text.
     * 
     * @param args Command-line arguments, not used in this program.
     */
    public static void main(String[] args){
        String testString = "Hello world, hello Java. Hello again!";

        System.out.println("Character count (excluding spaces): " + countCharacters(testString));
        System.out.println("Word count: " + countWords(testString));
        System.out.println("Unique word (case-insensitive): " + countUniqueWords(testString));
    }
}