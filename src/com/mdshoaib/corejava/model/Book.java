package com.mdshoaib.corejava.model;

public class Book {
    private int isbn_Num;
    private String title;
    private String author;
    private String publisher;
    private int publishingYear;
    private double price;
    private int stock_quantity;

    public Book(String title,String author,int isbn_Num){
        this.title=title;
        this.author=author;
        this.isbn_Num=isbn_Num;
        // mandatory information to create a new book entry.
    }
// read and write access.
    public void setStock_quantity(int stock_quantity) {
        if (this.stock_quantity>=0){
            this.stock_quantity=stock_quantity;
        }
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public int getIsbn_Num() {
        return isbn_Num;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    //The toString trick!
    @Override
    public String toString(){
        return "'Book': "+ this.title + " 'by' " + this.author;
    }
    //borrow logic.
    public void borrowBook(){
        if (stock_quantity>0){
            this.stock_quantity--;
            System.out.println("Book issued: "+this.isbn_Num);
        }else{

            System.out.println("This book is out of stock.");
        }
    }
    //return logic.
    public void returnBook(){
        this.stock_quantity++;
        System.out.println("Book returned: "+ this.isbn_Num);
    }
    //improved availability status;
    public boolean isAvailable(){
        return this.stock_quantity>0;
    }
}
