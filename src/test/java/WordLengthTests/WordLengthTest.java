package WordLengthTests;

import org.junit.jupiter.api.Test;

import static WordLengthPackage.WordLength.getLongestWord;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordLengthTest {

    @Test
    public void longestWordAtTheEnd() {
        String result = getLongestWord("The fox jumped");
        assertEquals("jumped", result);
    }

    @Test
    public void longestWordAtTheBeginning() {
        String result = getLongestWord("jumped fox fox");
        assertEquals("jumped", result);
    }

    @Test
    public void longestWordInTheMiddle() {
        String result = getLongestWord("the jumped fox");
        assertEquals("jumped", result);
    }

    @Test
    public void emptySentence() {
        String result = getLongestWord("");
        assertEquals("", result);
    }

    @Test
    public void twoLongestWordsAlphabeticalShouldBeSecondary() {
        String result = getLongestWord("longest asdfghj");
        assertEquals("asdfghj", result);
    }

    @Test
    public void twoLongestWordsAlphabeticalShouldBeSecondaryOtherWay() {
        String result = getLongestWord("asdfghj longest");
        assertEquals("asdfghj", result);
    }

    @Test
    public void specialCharsNotCounted() {
        String result = getLongestWord("@#@$@#$@%@@#$ the");
        assertEquals("the", result);
    }

    @Test
    public void specialCharsNotCountedWhenWithWord() {
        String result = getLongestWord("the. the");
        assertEquals("the", result);
    }
}
