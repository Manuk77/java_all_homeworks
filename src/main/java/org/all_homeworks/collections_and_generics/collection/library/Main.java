package org.all_homeworks.collections_and_generics.collection.library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Anders", "Hejlsberg");
        Author author1 = new Author("Bjorn", "Stroustrup");
        Author author2 = new Author("James", "Gosling");
        Book cSharp = new Book("C#", author, "America", 1992, "1234567890321");
        Book cpp = new Book("C++", author1, "America", 1984, "3215647890852");
        Book java = new Book("java", author2, "Georgia", 1999, "7412589630123");
        Book cpp1 = new Book("Effective c++", author1, "America", 1997, "9999632854710");
        ArrayList<Book> list = new ArrayList<>();
        list.add(cpp);
        list.add(cSharp);
        list.add(cpp1);

        Library library = new Library(list, "Polytechnic");

        System.out.println(library.addBook(java));
        System.out.println(library.addBook(java));

        System.out.println(library.searchBook("java", author));
        System.out.println(library.searchBook("java", author2));
        System.out.println(library.searchBook("java", author1));

        library.setName("Stroustrup");

        System.out.println(library.deleteBook(author));

        library.print();

        System.out.println(library.deleteWithIndex(2));
        library.print();


    }

}
