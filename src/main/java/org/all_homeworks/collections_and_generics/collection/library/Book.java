package org.all_homeworks.collections_and_generics.collection.library;

public class Book {
    private String title;
    private Author author;
    private String publisher;
    private int yearOfPublishing;
    private String ISBN;

    /**
     * this method sets titles name
     * @param title
     */
    public void setTitle(String title) {
        if (checkValidityOfString(title)) {
            this.title = title;
        }
    }

    /**
     * with this method we can get title name
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * this method sets author if it's not null
     * @param author
     */
    public void setAuthor(Author author) {
        if (author != null) {
            this.author = author;
        }
    }

    /**
     * @return author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * this method sets the books year of publishing if it's valid
     * @param yearOfPublishing
     */
    public void setYearOfPublishing(int yearOfPublishing) {
        if (checkValidityInt(yearOfPublishing)) {
            this.yearOfPublishing = yearOfPublishing;
        }
    }

    /**
     * @return books year of publishing
     */
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    /**
     * this method sets ISBN if it's valid
     * @param ISBN
     */
    public void setISBN(String ISBN) {
        if (checkISBN(ISBN)) {
            this.ISBN = ISBN;
        }
    }

    /**
     * @return ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * this method sets publisher if it's valid
     * @param publisher
     */
    public void setPublisher(String publisher) {
        if (checkValidityOfString(publisher)) {
            upperCaseFirstSymbol(publisher);
            this.publisher = publisher;
        }
    }

    /**
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
    }

    public Book(String title, Author author, String publisher, int yearOfPublishing, String ISBN) {
        if(checkValidityOfString(title) && checkValidityOfString(publisher)
                && checkValidityOfString(ISBN) && author != null
                && checkValidityInt(yearOfPublishing) && checkISBN(ISBN)) {
            this.title = title;
            this.publisher = publisher;
            this.author = author;
            this.yearOfPublishing = yearOfPublishing;
            this.ISBN = ISBN;
        }
    }

    /**
     * this method checks validity of string parameters
     * @param str
     * @return true if it's valid and false if it's invalid
     */
    public boolean checkValidityOfString(String str) {
        if (str != null && !str.isEmpty())  {
            upperCaseFirstSymbol(str);
            return true;
        }

        return false;
    }

    /**
     * this method checks validity of books year of publishing
     * @param yearOfPublishing
     * @return true if it's valid and false if it's invalid
     */
    public boolean checkValidityInt(int yearOfPublishing) {
        if(yearOfPublishing > 1950 && yearOfPublishing < 2024)
            return true;

        return false;
    }

    /**
     * this method checks ISBN validity
     * @param ISBN
     * @return true if it's valid and false if it's invalid
     */
    public boolean checkISBN(String ISBN) {
        if  (checkValidityOfString(ISBN)) {
            if (ISBN.length() == 13) {
                for (int i = 0; i < ISBN.length(); i++) {
                    if (!Character.isDigit(ISBN.charAt(i)))
                        return false;
                }
            }else
                return false;
        }else
            return false;

        return true;
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
        return "Book{" +
                "title = '" + title + '\'' +
                ", author = " + author +
                ", publisher = '" + publisher + '\'' +
                ", yearOfPublishing = " + yearOfPublishing +
                ", ISBN = '" + ISBN + '\'' +
                '}';
    }
}

