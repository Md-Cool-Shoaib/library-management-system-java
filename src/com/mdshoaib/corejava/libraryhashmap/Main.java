package com.mdshoaib.corejava.libraryhashmap;

import com.mdshoaib.corejava.model.Book;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        //String title,String author,int isbn_Num
        Book b1 = new Book("Clean Code","Robert C. Martin",1011);
        Book b2 = new Book("Introduction to Algorithms","Thomas H. Cormen",1012);
        Book b3 = new Book("Effective Java","Joshua Bloch",1013);
        myLibrary.addBook(b1);
        myLibrary.addBook(b2);
        myLibrary.addBook(b3);
        myLibrary.showAllBooks();
        myLibrary.findBook(1011);
        myLibrary.findBook(999);
        myLibrary.removeBook(1012);
        // 1. Create the messy list with duplicates
        ArrayList<String> messyGenres = new ArrayList<>();
        messyGenres.add("Sci-Fi");
        messyGenres.add("Fantasy");
        messyGenres.add("Sci-Fi"); // Here is a duplicate
        messyGenres.add("Action");
        messyGenres.add("Fantasy"); // Here is another duplicate

        System.out.println("Messy ArrayList: " + messyGenres);
// Output: [Sci-Fi, Fantasy, Sci-Fi, Action, Fantasy]

// 2. Pass the list into a HashSet to instantly filter it
        HashSet<String> cleanGenres = new HashSet<>(messyGenres);

        System.out.println("Clean HashSet: " + cleanGenres);
// Output: [Sci-Fi, Action, Fantasy] (The duplicates are gone!)

    }
}