package com.mdshoaib.corejava.libraryhashmap;

import com.mdshoaib.corejava.model.Book;

import java.util.*;

public class Library {
    private List<Book> catalog;


    private Map<Integer ,Book> bookIndex;
    public Library(){
        this.catalog = new ArrayList<>();
        this.bookIndex= new HashMap<>();
    }
    public void addBook(Book newBook){
        this.catalog.add(newBook);
        bookIndex.put(newBook.getIsbn_Num(), newBook);
        System.out.println("Added: "+ newBook);
    }
    public void findBook(int targetIsbn){
        Book book = bookIndex.get(targetIsbn);
        if(book !=  null){
            System.out.println("Found: "+ book.getTitle());
        }else{
            System.out.println("Book not found");
        }
    }



    public void removeBook(int targetIsbn){
        Iterator<Book> itr = catalog.iterator();
        while(itr.hasNext()){
            Book next = itr.next();
            if (next.getIsbn_Num() == targetIsbn){
                itr.remove();
                bookIndex.remove(targetIsbn);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
    public void showAllBooks(){
        for(Book i : this.catalog){
            System.out.println(i);
        }
    }




}
