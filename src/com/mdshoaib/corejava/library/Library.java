
package com.mdshoaib.corejava.library;
import com.mdshoaib.corejava.model.Book;

import java.util.ArrayList;
public class Library {
private ArrayList<Book> catalog;

public Library(){
this.catalog= new ArrayList<>();
}
public void addBook(Book newBook){
    if(newBook==null){
        throw new NullPointerException("Cannot add a blank (null) book to the catalog.");
    }
    this.catalog.add(newBook);
    System.out.println("Added: "+ newBook.getTitle());
}
public void showAllBooks(){
    for (Book book : this.catalog) {
        System.out.println(book);
    }
}
public void searchByTitle(String targetTitle){// aaba //AABa
   for (Book book : this.catalog){
       if (book.getTitle().equalsIgnoreCase(targetTitle)){
           System.out.println("Found: "+ book);
           return;
       }
   }
    System.out.println("Book not found.");

}
public void removeBook(String targetTitle){
    // Search for the book.
    for (int i=0; i <this.catalog.size(); i++){
        Book b = this.catalog.get(i);
        if (b.getTitle().equalsIgnoreCase(targetTitle)){
           this.catalog.remove(i);
            System.out.println("Removed: "+ targetTitle);
            return;
        }
    }
    System.out.println("Book not found, couldn't remove.");
}

}
// if (this.catalog[i].getTitle().equalsIgnoreCase(targetTitle)){
//System.out.println("Removing: " + this.catalog[i].getTitle());
//We found the book at 'i' now shift the last book to left.
//We loop from i to second last book.
//   0     1        2    3
//[java, python , oops,dbms]
//t=python
// oops dbms
// 3
// null