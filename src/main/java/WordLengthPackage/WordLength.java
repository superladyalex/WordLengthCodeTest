package WordLengthPackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WordLength {

    public static void main(String[] args) {

    }

    public static String getLongestWord(String input) {
        String[] arrayOfString = input.split(" ");

        List<String> list = Arrays.asList(arrayOfString);
        list.sort(Comparator.comparing(String::length).reversed().thenComparing(String::compareTo));

        return (String) Array.get(arrayOfString, 0);
    }
}
