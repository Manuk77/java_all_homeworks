package org.all_homeworks.collections_and_generics.collection.library;


public class Author {
    private String firstName;
    private String lastName;

    /**
     * this method sets the firsName of Author, if the given  names first character is lower case symbol it
     * calls upperCaseFirstSymbol() method for changing to upper case
     * @param firstName
     */
    public void setFirstName(String firstName){
        if(firstName != null && !firstName.isEmpty()){
            upperCaseFirstSymbol(firstName);
            this.firstName = firstName;
        }
    }

    /**
     * with this method we can get the Authors firsName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * this method sets last name of Author, if the given last names firs character is lower case symbol it
     * calls upperCaseFirstSymbol() method for changing to upper case
     * @param lastName
     */
    public void setLastName(String lastName) {
        if(lastName != null && !lastName.isEmpty()) {
            upperCaseFirstSymbol(lastName);
            this.lastName = lastName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public Author(){}

    public Author(String firstName, String lastName) {
        if(checkNamesValidity(firstName, lastName)){
            upperCaseFirstSymbol(firstName);
            upperCaseFirstSymbol(lastName);
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    /**
     * this method checks given fistNames and lastNames validity
     * @param firs firsName of Author
     * @param last lastName of Author
     * @return true if they are valid and false if it's not
     */
    private boolean checkNamesValidity(String firs, String last) {
        if((firs != null && !firs.isEmpty()) && (last != null && !last.isEmpty()))
            return true;

        return false;
    }

    /**
     * this method changes first characters case, if it's lower case it changes to upper case
     * @param name
     */
    public void upperCaseFirstSymbol(String name){
        if(Character.isLowerCase(name.charAt(0))) {
            Character.toUpperCase(name.charAt(0));
        }
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                '}';
    }
}
