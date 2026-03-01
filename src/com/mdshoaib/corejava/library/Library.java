package com.mdshoaib.corejava.library;

public class Library {
Book[] catalog;
int bookCount;
public Library(int maxCapacity){
    this.catalog= new Book[maxCapacity];
    this.bookCount=0;
}
public void addBook(Book newBook){
    if(newBook==null){
        throw new NullPointerException("Cannot add a blank (null) book to the catalog.");
    }
    if (this.bookCount>=this.catalog.length){
        throw new IllegalAccessError("Library is full! Cannot add any more books.");
    }
    this.catalog[bookCount]= newBook;
    this.bookCount++;
    System.out.println("Added" + newBook.getTitle());
}
public void showAllBooks(){
    for (int i=0; i < this.bookCount;i++){
        System.out.println(this.catalog[i]);
    }
}
public boolean searchByTitle(String targetTitle){// aaba //AABa
    for (int j=0; j < this.bookCount;j++){
        if (this.catalog[j].getTitle().equalsIgnoreCase(targetTitle)){
            System.out.println("Found: "+ this.catalog[j]);
            return true;
        }
    }
    System.out.println("Book not found.");
    return false;
}
public void removeBook(String targetTitle){
    // Search for the book.
    for (int i=0; i <this.bookCount; i++){

        if (this.catalog[i].getTitle().equalsIgnoreCase(targetTitle)){
            System.out.println("Removing: " + this.catalog[i].getTitle());
            //We found the book at 'i' now shift the last book to left.
            //We loop from i to second last book.
            for (int j=i; j <this.bookCount-1;j++){
                this.catalog[j]=this.catalog[j+1];
            }
            //Shrink our active library size by 1.
            this.bookCount--;
            //Nullify the leftover duplicate.
            this.catalog[this.bookCount]=null;
            //We are done so exit the method.
            return;
        }
    }
    System.out.println("Book not found, couldn't remove.");
}

}
