package org.all_homeworks.homeworks.string.string2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * ex.1
     * prints first two letters if th firs is "o" and the second is "z"
     * @param string
     */
    public void printsFirsTwoLetters(String string){

        if(string == null || string.isEmpty()){
            System.out.println("the given string is empty or has no reference to the object");
            return;
        }
        StringBuilder strB = new StringBuilder();
        if(string.charAt(0) == 'o'){
            strB.append(string.charAt(0));
            if(string.charAt(1) == 'z'){
                strB.append(string.charAt(1));
            }else{
                System.out.println("the second char is not equal to 'z'");
                return;
            }

        }else {
            System.out.println("the given strings first char is not equal to 'o'");
            return;
        }
        System.out.println(strB);

    }

    /**
     * ex. 2
     * counts the counts of two same symbols in the given string
     * @param str
     * @param c
     * @return
     */

    public int numberOfTwoChars(String str, char c){
        if (str == null || str.isEmpty()) {
            System.out.println("the given string is empty or has no reference to the object");
            return -1;
        }
        if (c == ' ') {
            System.out.println("the given character is empty");
            return -1;
        }
        int count = 0;
        for(int i = 0; i < str.length() - 1; ++i){
            if(str.charAt(i) == c && str.charAt(i + 1) == c){
                count++;
            }
        }
        return count;

    }

    /**
     * ex.3
     * the method returns true if the given string is palindrome, if it's not returns false
     * @param string
     * @return
     */
    public boolean isPalindrome(String string){
        if(string == null || string.isEmpty()){
            System.out.println("the given string is empty or has no reference to the object");
            return false;
        }
        if(string.length() == 1){
            return true;
        }

        for(int i = 0, j = string.length() - 1; i < string.length() / 2; ++i, --j){
            if(string.charAt(i) != string.charAt(j)){
                return false;
            }
        }
        return true;
    }

    /**
     * ex.4
     * if the first letter starts with 'a' and the length of the string is equal to 3 returns it
     * @param stringList
     * @return new List<string>
     */
    public List<String>  returnsList(List<String> stringList){

        if(stringList == null || stringList.isEmpty()){
            System.out.println("the given list is null or empty list");
            return null;
        }
        for(int i = 0; i < stringList.size(); ++i){
            if(!stringList.get(i).startsWith("a") || stringList.get(i).length() != 3){
                stringList.remove(stringList.get(i));
                --i;
            }
        }
        return stringList;
    }

    /**
     * ex.5
     * it adds 'e' symbol if number is even and 'o' if number is odd
     * [1, 2, 3, 4] -> [o1, e2, o3, e4]
     * @param list
     * @return a string list
     */
    public List<String> commaSeparatedString(List<Integer> list){

        if(list == null || list.isEmpty()){
            System.out.println("the given list is empty or has no reference to the object");
            return null;
        }

        List<String> stringList = new ArrayList<>();
        int j = 1;
        for(int i = 0; i < list.size(); i += j){
            if((list.get(i) & 1) == 1){
                stringList.add("o" + list.get(i));
            }else{
                stringList.add("e" + list.get(i));
            }
        }

        return stringList;
    }

    /**
     * ex.6
     * modifies the given string to the caesars cipher with adding to the every char with n
     * @param str
     * @param n
     * @return caesars cipher type of StringBuilder
     */
    public StringBuilder caesarsCipher(String str, int n){
        if(str == null || str.isEmpty()){
            System.out.println("the given list is empty or has no reference to the object");
            return null;
        }
        if(n > 25 || n < 1){
            System.out.println("the given n has to be in range [1, 25] ");
            return null;
        }
        StringBuilder strResult = new StringBuilder ();
        for (int i = 0; i < str.length(); ++i) {
            if (Character.isUpperCase(str.charAt(i))) {
                strResult.append((str.charAt(i) - 65) % 26 + 65);
            } else if (Character.isLowerCase(str.charAt(i))) {
                strResult.append((str.charAt(i) - 97) % 26 + 97);
            }else{
                strResult.append(str.charAt(i));
            }
        }
        return strResult;

    }

    public String longestPalindrome(String str){
        if(str == null || str.isEmpty()){
            System.out.println("the given list is empty or has no reference to the object");
            return null;
        }
        String str1 = new String();
        String str2 = new String();
        if(str.length() == 1){
            return str;
        }
        for(int i = 0; i < str.length(); ++i){
            for(int j = i + 1; j < str.length(); ++j){
                if(isPalindrome(str.substring(i, j))){
                    str1 = str.substring(i, j);
                    if(str1.length() > str2.length()){
                        str2 = str1;
                    }
                }
            }
        }
        return str2;

    }

    /**
     * ex.8
     * helping methods are isCommonSequence() and compereWith()
     * fiends longest common subSequence
     * @param str1
     * @param str2
     * @return longest sub sequence
     */


    public String longestCommonSubSequence(String str1, String str2){
        if(str1 == null || str2 == null){
            System.out.println("the given strings has no reference");
            return null;
        }
        if(str1.isEmpty() || str2.isEmpty()){
            System.out.println("one of the given strings are empty ");
            return null;
        }
        List<String> allSubSequences;
        allSubSequences = allPossibleSubSequences(str2);
        List<String> containingSubSequences = new ArrayList<>();
        for(int i = 0; i < str1.length() - 1; ++i){
            for(int j = i + i; j < str1.length(); ++j){
                if(contains(str1.substring(i, j), allSubSequences)){
                    containingSubSequences.add(str1.substring(i, j + 1));
                }
            }
        }
        return longestSequence(containingSubSequences);
    }

    /**
     * helping method for ex.8
     * calculates all possible subSequences and collects in the list
     * @param str2
     * @return List<String>
     */
    public List<String> allPossibleSubSequences(String str2){
        List<String> stringList = new ArrayList<>();
        for(int i = 0; i < str2.length() - 1; ++i){
            for(int j = i + 1; j < str2.length(); ++j){
                stringList.add(str2.substring(i, j));
            }
        }
        return stringList;
    }

    /**
     * helping method for ex.8
     * checks if the given string is containing in the given list
     * @param str1
     * @param stringList
     * @return true or false
     */
    public boolean contains(String str1, List<String> stringList){
        for(String item : stringList){
            if(str1.equals(item)){
                return true;
            }
        }
        return false;

    }

    /**
     * helping method for ex.8
     * fiends the longest sequence in the given list
     * @param stringList
     * @return longest sequence type of String
     */
    public String longestSequence(List<String> stringList){
        String str = stringList.get(0);
        for(int i = 1; i < stringList.size(); ++i){
            String tempStr = stringList.get(i);
            if(str.length() < tempStr.length()){
                str = tempStr;
            }
        }
        return str;
    }

    /**
     * ex.9
     * calculates the number of characters in the given strings
     * @param str1
     * @param str2
     * @return numberOfCharacters
     */
    public int numberOfCommonCharacters(String str1, String str2){
        if(str1 == null || str2 == null){
            System.out.println("the given strings has no reference");
            return -1;
        }
        if(str1.isEmpty() || str2.isEmpty()){
            System.out.println("one of the given strings are empty ");
            return -2;
        }
        int numberOfCharacters = 0;
        for(int i = 0; i < str1.length(); ++i){
            if(isCharacter(str1.charAt(i), str2)){
                numberOfCharacters++;
            }
        }
        return numberOfCharacters;
    }

    /**
     * helping method foe ex.9
     * checks if is the given char in the given string
     * @param c
     * @param str2
     * @return true or false
     */
    public boolean isCharacter(char c, String str2){
        for(int i = 0; i < str2.length(); ++i){
            if(c == str2.charAt(i)){
                return true;
            }
        }
        return false;
    }



    /*
    public StringBuilder reverseRes(String str){
        if(str == null || str.isEmpty()){
            System.out.println("the given strings has no reference");
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        String reversString;
        List<Integer> indexOfParentheses = new ArrayList<>();
        fiendsParentheses(stringBuilder, indexOfParentheses);
        for(int i = indexOfParentheses.size() / 2  - 1; i >= 0; --i){
           reversString =  reverse(stringBuilder.substring(indexOfParentheses.get(i) , indexOfParentheses.get(indexOfParentheses.size() - i - 1) + 1));
           stringBuilder.replace(indexOfParentheses.get(i),indexOfParentheses.get(indexOfParentheses.size() - i - 1), reversString);
           stringBuilder.deleteCharAt(indexOfParentheses.get(i));
           stringBuilder.deleteCharAt(indexOfParentheses.get(indexOfParentheses.size() - i - 1));
           System.out.println(stringBuilder);

        }
        return stringBuilder;
    }*/


    /*
    public void fiendsParentheses(StringBuilder str, List<Integer> integerListOpeningClosing){
        List<Integer> integerListClosing = new ArrayList<>();
        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == '('){
                integerListOpeningClosing.add(i);
            } else if (str.charAt(i) == ')') {
                integerListClosing.add(i);
            }
        }
        if(integerListOpeningClosing.size() == integerListClosing.size()){
            for(int i = 0; i < integerListClosing.size(); ++i){
                integerListOpeningClosing.add(integerListClosing.get(i));
            }
        }

    }
    */

   /*
   public String reverse(String str1){
       String str2;
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append(str1);
       stringBuilder.reverse();
       str2 = stringBuilder.toString();
       return str2;
    }*/






    public static void main(String[] args){

        Main ob = new Main();





        //String[] str = {"acs", "acvf", "dsff", "axd"};
        //ob.morseAlphabet("java academic program");
        //ob.printsFirsTwoLetters("");
        //System.out.println(ob.isPalindrome("abccba"));
        //System.out.println(ob.returnsList(str));
        //System.out.println(ob.numberOfTwoChars("xccxxc", 'c'));
        //System.out.println(ob.commaSeparatedString(list));
        //System.out.println(ob.returnsList(stringList));

        //System.out.println(ob.longestPalindrome("abacaaacabcabacba"));
        //System.out.println(ob.longestCommonSubSequence("inchkachkavonces", "voncesinchkachka"));
        //System.out.println(ob.numberOfCommonCharacters("voncesinvhkamanuk", "voncesinchkamanu"));
        //System.out.println(ob.reverseRes("(abc(acd(ade)adf))"));
    }
}
