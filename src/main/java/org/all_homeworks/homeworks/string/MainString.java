package org.all_homeworks.homeworks.string;

import java.util.Scanner;

public class MainString {


    /**
     * ex.1
     *the method does string concatenation
     * @param varArgs
     */
    public void concat(Object ... varArgs){

        for(Object x: varArgs){
            System.out.print(x + " ");
        }


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
    public void StringNewLine(StringBuilder string){

        if(string.equals("")){
            System.out.println("given string is empty");
            return;
        }

        //System.out.println(string);
        for(int i = 0; i < string.length(); ++i){
            char c = string.charAt(i);
            if(Character.isSpaceChar(c)){
                string.replace(i, i + 1, "\n");
            }

        }
        System.out.println(string);


    }

    /**
     * ex.3
     * prints the given string in a revers order
     * @param string
     */
    public void reversString(String string){

        if(string.equals("")){
            System.out.println("the given string is empty");
            return;
        }
        StringBuilder revers = new StringBuilder(string.length());

        for(int i = string.length() - 1; i >= 0; --i){
            revers.append(string.charAt(i));
        }

        System.out.println(revers);

    }

    /**
     * ex.4
     * the method prints that how many times was founded the given token in the given string
     * @param string
     */

    public void countOfSubstrings(String string, String token){

        if(string.equals("")){
            System.out.println("the given string is empty");
            return;
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

    }

    /**
     * ex.5
     * changes the given string to uppercase
     * @param string
     */
    public void toUpperCase(String string){
        if(string.equals("")){
            System.out.println("the given string is empty");
            return;
        }
        System.out.println(string.toUpperCase());

    }

    /**
     * ex.6
     * print the string. if lenght of string is less than 20 adds "*"
     * @param  string
     */

    public void printStringTwenty(StringBuilder string){

        if (string.equals("")) {
            System.out.println("the given arr of char is empty");
            return;

        }
        if (string.length() < 20) {
             for(int i = string.length(); i < 20; ++i) {
                 string.append("*");
             }
        }else {
            System.out.println("the given string has more than 20 sinvols");
        }
        System.out.println(string);

    }

    /**
     * ex.7
     * removes a sinvol from given string
     * @param string
     */
    public void removesSimbol(String string){

        if(string.equals("")){
            System.out.println("the given string is empty");
            return;
        }

        string = string.replace("a", "");

        System.out.println(string);

    }

    /**
     * ex.8
     * replases two simbols ("a" replases to "*")
     * @param string
     */
    public void replasesTwoSimbols(String string){
        if(string.equals("")){
            System.out.println("the given string is empty");
            return;
        }
        string = string.replace('a', '*');

        System.out.println(string);

    }

    /**
     * ex.9
     * prints the longes word in the given string
     * @param string
     */
    public void foundsTheLongestWord(String string){
        if(string.equals("")){
            System.out.println("the given string is empty");
            return;
        }
        String longesWord = new String("");
        String tempWord = new String("");

        for (int i = 0; i < string.length(); ++i) {
            if (string.charAt(i) != ' '){
                tempWord += string.charAt(i);
            }else {
                if(tempWord.length() > longesWord.length()){
                    longesWord = tempWord;

                }
                tempWord = "";
            }

        }
        longesWord = tempWord;


        System.out.println("longes word is -> " + longesWord);
    }

    /**
     * ex.10
     * founds the firs index of given simbol
     * @param string
     * @param simbol
     */

    public void foundsSearchingSimbolsFirstIndex(String string, String simbol){
        if (string.equals("")) {
            System.out.println("the given string is empty");
            if (simbol.equals("")) {
                System.out.println("the given simbol is empty");
            }
        }
        char c = simbol.charAt(0);
        for (int i = 0; i < string.length(); ++i) {
           char z = string.charAt(i);
           if(z == c){
               System.out.println("the index of first founded simbol is -> " + i);
               return;
           }
        }

    }

    /**
     * ex.11
     * prints the given string to the given index
     * @param string
     * @param index
     */
    public void printsStringToTheGivenIndex(String string, int index){
        if(string.equals("")){
            System.out.println("the given string is empty");
            return;
        }
        if(index >= string.length() || index < 0){
            System.out.println( " the given index " + index + " is out of bounds");
            return;
        }
        for(int i = 0; i <= index; ++i){
            System.out.print(string.charAt(i));
        }
        System.out.println();
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
     * @param simbol
     */
    public void largesWordSplittedWithGivenSimbol(String string, char simbol){
        if(string.isEmpty()){
            System.out.println("the given string is empty");
            return;
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
        System.out.println("the longes word is -> " + longesWord);
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);



        MainString ms = new MainString();
        String string1 = new String("hello");
        String string2 = new String("world");
        StringBuilder string3 = new StringBuilder("We are living in");

        String string4 = "simple";
        //ms.concat(12, string2);
        //ms.StringNewLine(string3);
        //ms.reversString(string4);
        //ms.countOfSubstrings( "We are living in an yellow submarine. We dont  have anything", "in");
        //ms.toUpperCase(string4);

        //StringBuilder string = new StringBuilder(sc.next());
        //ms.printStringTwenty(string);
        //ms.removesSimbol("armenia is the great country");
        //ms.replasesTwoSimbols("areal armenia");
        //ms.foundsTheLongestWord("my name is Manuk");
        //ms.foundsSearchingSimbolsFirstIndex("are you boy", "y");
        //ms.printsStringToTheGivenIndex("haleluya fdhsjhf", 10);
        //string1 = null;
        //System.out.println(ms.isEmptyOrNull(""));
        //ms.largesWordSplittedWithGivenSimbol("We, are, living, in an, yellow, submarine, We don't,  have anything", ',');
    }

}
