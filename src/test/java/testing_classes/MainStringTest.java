package testing_classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainStringTest {
    MainString obj = new MainString();
    @Test
    void concatTest() {
        String str1 = "Manuk ";
        String str2 = "Movsesyan";
        String res = "Manuk Movsesyan";

        assertEquals(res, obj.concat(str1, str2));
    }

    @Test
    void stringNewLineTest() {
        StringBuilder str1 = new StringBuilder("hello world!");
        String res = "hello\nworld!";
        assertEquals(res, obj.StringNewLine(str1));
    }

    @Test
    void reversStringTest() {
        String str1 = "hello world!";
        String revStr = "!dlrow olleh";
        assertEquals(revStr, obj.reversString(str1));
    }

    @Test
    void countOfSubstringsTest() {
        String str1 = "We are living in an yellow submarine. We dont  have anything";
        String str2 = "in";
        int res = 4;
        assertEquals(res, obj.countOfSubstrings(str1, str2));
    }

    @Test
    void toUpperCaseTest() {
        String str1 = "hello";
        String res = "HELLO";
        assertEquals(res, obj.toUpperCase(str1));
    }

    @Test
    void printStringTwentyTest() {
        StringBuilder str = new StringBuilder("mansjfhvuntskent");
        String res = "mansjfhvuntskent****";
        assertEquals(res, obj.printStringTwenty(str));
    }

    @Test
    void removesSymbolTest() {
        String str1 = "Manuk";
        String res = "Mnuk";
        assertEquals(res, obj.removesSymbol(str1));
    }

    @Test
    void replacesTwoSymbolsTest() {
        String str1 = "Manuk";
        String res = "M*nuk";
        assertEquals(res, obj.replacesTwoSymbols(str1));
    }

    @Test
    void foundsTheLongestWordTest() {
        String str1 = "my name is Manuk";
        String res = "Manuk";
        assertEquals(res, obj.foundsTheLongestWord(str1));
    }

    @Test
    void foundsSearchingSymbolsFirstIndexTest() {
        String str1 = "my name is Manuk";
        String str2 = "e";
        int res = 6;
        assertEquals(res, obj.foundsSearchingSymbolsFirstIndex(str1, str2));
    }

    @Test
    void printsStringToTheGivenIndexTest() {
        String str1 = "my name is Manuk";
        String res = "my name is";
        assertEquals(res, obj.printsStringToTheGivenIndex(str1, 9));
    }

    @Test
    void isEmptyOrNull() {
        String str = "";
        assertEquals(true, obj.isEmptyOrNull(str));
    }

    @Test
    void largesWordSplittedWithGivenSymbolTest() {
        String str1 = "We, are, living, in an, yellow, submarine, We don't,  have anything";
        String res = "  have anything";
        assertEquals(res, obj.largesWordSplittedWithGivenSymbol(str1, ','));
    }
}