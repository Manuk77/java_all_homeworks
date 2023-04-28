package org.all_homeworks.homeworks.string.stringbuillder;

public class MainStringBuilder {

    /**
     * ex.1
     * the method does string concatenation
     * (in String builder is not + operator is append() method)
     * @param string1
     * @param string2
     */
    public void concat(StringBuilder string1, StringBuilder string2){

        if(string1.isEmpty() && string2.isEmpty()){
            System.out.println("there is nothing to concatenate");
            return;
        }
        StringBuilder string3 = new StringBuilder();
        string3.append(string1).append(string2);
        System.out.println(string3);


    }

    /**
     * ex.5
     * changes the given string to uppercase (with StringBuilder class)
     * @param string
     */
    public void toUpperCase(StringBuilder string){
        if(string.isEmpty()){
            System.out.println("the given string is empty");
            return;
        }
        for(int i = 0; i < string.length(); ++i){
            char c = string.charAt(i);
            if(Character.isLowerCase(c)){
                string.setCharAt(i, Character.toUpperCase(c));
            }
        }
        System.out.println(string);
    }

    /**
     * ex.7
     * removes "a" simbol from given StringBuilder
     * @param string
     */
    public void removeSimbol(StringBuilder string){
        if(string.isEmpty()){
            System.out.println("the given string is empty");
            return;
        }
        for(int i = 0; i < string.length(); ++i){
            if(string.charAt(i) == 'a'){
                string.deleteCharAt(i);
                --i;
            }
        }
        System.out.println(string);

    }

    /**
     * ex.11
     * prints the given string to the given index
     * @param string
     * @param index
     */

     public void printsStringToTheGivenIndex(StringBuilder string, int index){
        if (string.isEmpty()) {
            System.out.println("the given string is empty");
            return;
        }
        if (index >= string.length() || index < 0) {
            System.out.println("the given index " + index + " is out of bounds");
            return;
        }
        for(int i = 0; i <= index; ++i){
            System.out.print(string.charAt(i));
        }
         System.out.println();
     }

    public static void main(String[] args){

        StringBuilder string1 = new StringBuilder("hello ");
        StringBuilder string2 = new StringBuilder(" world ");
        StringBuilder string3 = new StringBuilder("");

        MainStringBuilder obMSB = new MainStringBuilder();
        //obMSB.concat(string1, string2);
        //obMSB.toUpperCase(string1);

        //obMSB.removeSimbol(string3);
        obMSB.printsStringToTheGivenIndex(string3, 0);


    }
}
