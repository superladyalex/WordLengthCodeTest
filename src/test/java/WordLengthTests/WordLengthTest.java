package WordLengthTests;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static WordLengthPackage.WordLength.getLongestWord;
import static WordLengthPackage.WordLength.getShortestWord;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordLengthTest {

    //Longest Word Tests

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
    public void emptySentenceLongestMethod() {
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
    public void twoLongestWordsAlphabeticalSCapitalShouldWin() {
        String result = getLongestWord("and The");
        assertEquals("The", result);
    }

    @Test
    public void specialCharsNotCountedLongest() {
        String result = getLongestWord("@#@$@#$@%@@#$ the");
        assertEquals("the", result);
    }

    @Test
    public void specialCharsNotCountedWhenWithWordLongest() {
        String result = getLongestWord("the. the");
        assertEquals("the", result);
    }


    //Shortest Word Tests

    @Test
    public void shortestWordAtTheBeginning() {
        String result = getShortestWord("The fox jumped");
        assertEquals("The", result);
    }

    @Test
    public void shortestWordAtTheEnd() {
        String result = getShortestWord("Quick jumped fox");
        assertEquals("fox", result);
    }

    @Test
    public void shortestWordInTheMiddle() {
        String result = getShortestWord("jumped fox water");
        assertEquals("fox", result);
    }

    @Test
    public void emptySentenceShortestMethod() {
        String result = getShortestWord("");
        assertEquals("", result);
    }

    @Test
    public void twoShortestWordsAlphabeticalShouldBeSecondary() {
        String result = getShortestWord("the and");
        assertEquals("and", result);
    }

    @Test
    public void twoShortestWordsAlphabeticalShouldBeSecondaryOtherWay() {
        String result = getShortestWord("and the");
        assertEquals("and", result);
    }

    @Test
    public void twoShortestWordsAlphabeticalCapitalShouldWin() {
        String result = getShortestWord("and The");
        assertEquals("The", result);
    }

    @Ignore
    public void shortestWordShouldNotBeSpecialChar() {
        String result = getShortestWord(". the");
        assertEquals("the", result);
    }

    @Test
    public void specialCharsNotCountedForShortest() {
        String result = getShortestWord("e........ the");
        assertEquals("e", result);
    }

}
