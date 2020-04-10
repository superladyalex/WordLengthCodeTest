package WordLengthPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WordLength {

    public static void main(String[] args) {

    }

    public static String getLongestWord(String input) {
        String[] arrayOfString = input.split(" ");

        Arrays.sort(arrayOfString, (a, b) -> b.length() - a.length());

        return (String) Array.get(arrayOfString, 0);
    }
}
