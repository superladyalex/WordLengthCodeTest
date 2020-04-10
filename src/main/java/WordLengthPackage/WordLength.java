package WordLengthPackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WordLength {

    public static void main(String[] args) {

    }

    public static String getLongestWord(String input) {
        String cleanString = input.replaceAll("[^a-zA-Z0-9]", " ");
        String[] arrayOfString = cleanString.split(" ");

        List<String> list = Arrays.asList(arrayOfString);
        list.sort(Comparator.comparing(String::length).reversed().thenComparing(String::compareTo));

        return (String) Array.get(arrayOfString, 0);
    }

    public static String getShortestWord(String input) {
        String cleanString = input.replaceAll("[^a-zA-Z0-9]", " ");
        String[] arrayOfString = cleanString.split(" ");

        List<String> list = Arrays.asList(arrayOfString);
        list.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));

        return (String) Array.get(arrayOfString, 0);
    }
}
