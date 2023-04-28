package org.all_homeworks.collections_and_generics.collection.library;

import java.util.ArrayList;

public class Library {
    private String name;
    ArrayList<Book> libraryBooks;

    /**
     * this method sets libraries name if it's valid
     * @param name of Library
     */
    public void setName(String name) {
        if (checkValidityOfString(name)) {
            upperCaseFirstSymbol(name);
            this.name = name;
        }
    }

    /**
     * @return libraries name
     */
    public String getName() {
        return name;
    }

    /**
     * this method sets the libraryBooks list
     * @param libraryBooks of Library
     */
    public void setLibraryBooks(ArrayList<Book> libraryBooks) {
        if (libraryBooks != null) {
            this.libraryBooks = libraryBooks;
        }
    }

    /**
     * @return ArrayList of books
     */
    public ArrayList<Book> getLibraryBooks() {
        return libraryBooks;
    }

    /**
     * non parameter constructor
     */
    public Library() {}

    /**
     * constructor with parameters
     * @param libraryBooks ArrayList of books
     * @param name library name
     */
    public Library(ArrayList<Book> libraryBooks, String name) {
        if (checkValidityOfString(name) && libraryBooks != null) {
           upperCaseFirstSymbol(name);
           this.libraryBooks = libraryBooks;
           this.name = name;
        }
    }


    /**
     * this method checks validity of string parameters
     * @param str specified String type str which is going to check for validity
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
     * this method checks validity of given book, and if it's exist in libraryBooks list, if exist returns false,
     * if not adds in list
     * @param book of Library
     * @return true if it's added and false if it's not pass the validity part
     */
    public boolean addBook(Book book) {
        if (book != null) {
           if (!libraryBooks.isEmpty()) {
               for (Book x: libraryBooks) {
                    if(x.getAuthor() == book.getAuthor() && x.getTitle() == book.getTitle()) {
                        return false;
                    }
               }
               libraryBooks.add(book);
               return true;
           }
        }
        return false;
    }

    /**
     * this method searches book with specified title and with specified Authors first and last name
     * @param title of searching book
     * @param author of searching book
     * @return true if it's founded and false if it's not
     */
    public boolean searchBook(String title, Author author) {
        if ((checkValidityOfString(title) && author != null) && !libraryBooks.isEmpty()) {
            for (int i = 0; i < libraryBooks.size(); ++i) {
                if (libraryBooks.get(i).getTitle() == title && libraryBooks.get(i).getAuthor() == author) {
                    System.out.println(libraryBooks.get(i));
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * this method search book with specified Authors lastName
     * @param lastName of Author
     * @return true if founded and false if not
     */
    public boolean searchBookWithLastName(String lastName) {
        if (checkValidityOfString(lastName) && !libraryBooks.isEmpty()) {
            int count = 0;
            for (int i = 0; i < libraryBooks.size(); ++i) {
                if (libraryBooks.get(i).getAuthor().getLastName() == lastName) {
                    System.out.println(libraryBooks.get(i).getTitle());
                    count++;
                }
            }
            if (count > 0)
                return true;
        }
        return false;
    }

    /**
     * this method removes the books from the library with specified Authors firs and las names
     * @param author of book
     * @return true if the specified Authors book exist in library and false if it's not
     */
    public boolean deleteBook(Author author) {
        if (author != null && !libraryBooks.isEmpty()) {
            int countOfRemoved = 0;
            for (int i = 0; i < libraryBooks.size(); ++i) {
                if (libraryBooks.get(i).getAuthor() == author) {
                    libraryBooks.remove(i);
                    countOfRemoved++;
                }
            }
            if (countOfRemoved > 0)
                return true;
        }
        return false;
    }

    /**
     * this method removes with specified index:
     * deleteWithIndex() method checks index validity
     * @param index specified index of removing element
     * @return true if removed and false if it's not valid index or the list is empty
     */
    public boolean deleteWithIndex(int index) {
        if (checkIndex(index) && !libraryBooks.isEmpty()) {
            libraryBooks.remove(index);
            return true;
        }
        return false;
    }

    /**
     * this method prints all books which are in library
     */
    public void print() {
        for (Book x : libraryBooks) {
            System.out.println(x);
        }
    }


    /**
     * this method changes first characters case, if it's lower case it changes to upper case
     * @param name String type name which is checking first symbol is upper case or not, if it's not
     *             then changes to upper case
     */
    public void upperCaseFirstSymbol(String name){
        if(Character.isLowerCase(name.charAt(0))) {
            Character.toUpperCase(name.charAt(0));
        }
    }

    /**
     * this method checks legality of the given index
     * @param index which has to be checked for validity
     * @return true if it's valid index, and false if it's not
     * @throws IllegalArgumentException if the given index is out of range throws IllegalArgumentException
     */
    private boolean checkIndex(int index) throws IllegalArgumentException{
        if(index < 0 || index >= libraryBooks.size()){
            try {
                throw  new IllegalArgumentException("Illegal Argument  " + index);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());

            }finally {
                return false;
            }
        }
        return true;
    }
}
