package org.all_homeworks.classes_for_testing;

public class MainString {
    /**
     * ex.1
     *the method does string concatenation
     * @param varArgs
     */
    public String concat(Object ... varArgs){
        String str  = "";
        for(Object x: varArgs){
            str += x;
        }
        System.out.println(str);
        return str;


        /*if(string1.equals("") || string2.equals("")){
            System.out.println("there is nothing to concatenate");
            return;
        }
        System.out.println(string1 + string2 + "\n");
        System.out.println(1 + 2 + string1 + "\n");
        System.out.println("1" + 2 + string1 + "\n");
        System.out.println(string1 + 1 + 2 + string2 +"\n");*/

    }

    /**
     *  ex.2
     *  prints string on a new line when finds an empty character
     */
    public String StringNewLine(StringBuilder string){

        if(string.equals("")){
            System.out.println("given string is empty");
            return "";
        }

        //System.out.println(string);
        for(int i = 0; i < string.length(); ++i){
            char c = string.charAt(i);
            if(Character.isSpaceChar(c)){
                string.replace(i, i + 1, "\n");
            }

        }
        System.out.println(string);

        return string.toString();
    }

    /**
     * ex.3
     * prints the given string in a revers order
     * @param string
     */
    public String reversString(String string){

        if(string.equals("")){
            System.out.println("the given string is empty");
            return "";
        }
        StringBuilder revers = new StringBuilder(string.length());

        for(int i = string.length() - 1; i >= 0; --i){
            revers.append(string.charAt(i));
        }

        System.out.println(revers);
        return revers.toString();
    }

    /**
     * ex.4
     * the method prints that how many times was founded the given token in the given string
     * @param string
     */

    public int  countOfSubstrings(String string, String token){

        if(string.equals("")){
            System.out.println("the given string is empty");
            return - 1;
        }

        int count = 0;
        int index = 0;
        while(true) {
            index = string.indexOf(token, index);
            if(index > -1) {
                count++;
                index += token.length();
            }else {
                break;
            }
        }
        System.out.println("count -> " + count);
        return count;
    }

    /**
     * ex.5
     * changes the given string to uppercase
     * @param string
     */
    public String toUpperCase(String string){
        if(string.equals("")){
            System.out.println("the given string is empty");
            return "";
        }
        System.out.println(string.toUpperCase());
        return string.toUpperCase();
    }

    /**
     * ex.6
     * print the string. if lenght of string is less than 20 adds "*"
     * @param  string
     */

    public String printStringTwenty(StringBuilder string){

        if (string.equals("")) {
            System.out.println("the given arr of char is empty");
            return "";

        }
        if (string.length() < 20) {
            for(int i = string.length(); i < 20; ++i) {
                string.append("*");
            }
        }else {
            System.out.println("the given string has more than 20 sinvols");
        }
        System.out.println(string);
        return string.toString();
    }

    /**
     * ex.7
     * removes a sinvol from given string
     * @param string
     */
    public String removesSymbol(String string){

        if(string.equals("")){
            System.out.println("the given string is empty");
            return "";
        }

        string = string.replace("a", "");

        System.out.println(string);
        return string;
    }

    /**
     * ex.8
     * replaces two symbols ("a" replaces to "*")
     * @param string
     */
    public String replacesTwoSymbols(String string){
        if(string.equals("")){
            System.out.println("the given string is empty");
            return "";
        }
        string = string.replace('a', '*');

        System.out.println(string);
        return string;
    }

    /**
     * ex.9
     * prints the longes word in the given string
     * @param string
     */
    public String foundsTheLongestWord(String string){
        if(string.equals("")){
            System.out.println("the given string is empty");
            return "";
        }
        String longestWord = new String("");
        String tempWord = new String("");

        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) != ' '){
                tempWord += string.charAt(i);
            }else {
                if(tempWord.length() > longestWord.length()){
                    longestWord = tempWord;

                }
                tempWord = "";
            }

        }
        longestWord = tempWord;


        System.out.println("longest word is -> " + longestWord);
        return longestWord;
    }

    /**
     * ex.10
     * founds the firs index of given simbol
     * @param string
     * @param symbol
     */

    public int  foundsSearchingSymbolsFirstIndex(String string, String symbol){
        if (string.equals("")) {
            System.out.println("the given string is empty");
            if (symbol.equals("")) {
                System.out.println("the given symbol is empty");
            }
        }
        int index = 0;
        char c = symbol.charAt(0);
        for (int i = 0; i < string.length(); ++i) {
            char z = string.charAt(i);
            if(z == c){
                System.out.println("the index of first founded symbol is -> " + i);
                index = i;
               break;
            }
        }
        return index;
    }

    /**
     * ex.11
     * prints the given string to the given index
     * @param string
     * @param index
     */
    public String printsStringToTheGivenIndex(String string, int index){
        if(string.equals("")){
            System.out.println("the given string is empty");
            return "";
        }
        if(index >= string.length() || index < 0){
            System.out.println( " the given index " + index + " is out of bounds");
            return "";
        }
        for(int i = 0; i <= index; ++i){
            System.out.print(string.charAt(i));
        }
        System.out.println();
        String res = string.substring(0, index + 1);
        return res;
    }

    /**
     * ex.12
     * returns boolen value is String empty or null
     * @param string
     * @return true or false
     */

    public boolean isEmptyOrNull(String string){
        return( string == null || string.isEmpty());
    }

    /**
     * ex.13
     * prints longes word spleted with "," simbol
     * @param string
     * @param symbol
     */
    public String largesWordSplittedWithGivenSymbol(String string, char symbol){
        if(string.isEmpty()){
            System.out.println("the given string is empty");
            return "";
        }
        String longesWord = "";
        String tempWord = new String("");
        for (int i = 0; i < string.length(); ++i){
            if(string.charAt(i) != ','){
                tempWord += string.charAt(i);
            }else {
                if(tempWord.length() > longesWord.length()){
                    longesWord = tempWord;
                }
                tempWord = "";
            }
        }
        longesWord = tempWord;
        System.out.println("the longest word is -> " + longesWord);
        return longesWord;
    }
}

