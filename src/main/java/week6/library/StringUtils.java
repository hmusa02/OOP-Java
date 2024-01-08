package week6.library;

public class StringUtils {
    public static boolean included(String word, String searched) {

        if (word == null || searched == null) {
            return false;
        }

        // Trim and convert to lowercase for case-insensitive comparison
        String trimmedWord = word.trim().toLowerCase();
        String trimmedSearched = searched.trim().toLowerCase();

        // Check if 'searched' is contained in 'word'
        return trimmedWord.contains(trimmedSearched);

    }
}
