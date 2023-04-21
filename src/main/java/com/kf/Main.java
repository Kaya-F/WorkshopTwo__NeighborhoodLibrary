package com.kf;

public class Main {
    public static void main(String[] args) {
        //{"The Seamstress", "Cinder", "Invisible Man", "Fahrenheit 451", "Pride & Prejudice"};
        Book TheSeamstress = new Book ();
        //fiveBooksNeeded

    }
}

// Create a book class
class Book {
    //properties of the books
    public int bookId;
    public String isbn;
    public String bookTitle;
    public Boolean isCheckedOut;
    public String checkedOutTo;

    //Constructor(s)
    public Book(int bookId, String isbn, String bookTitle, Boolean isCheckedOut, String checkedOutTo){
        this.bookId = bookId;
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
}


}
