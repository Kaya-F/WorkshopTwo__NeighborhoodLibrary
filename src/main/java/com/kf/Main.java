package com.kf;

import javax.lang.model.element.Name;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Create Array to display the 5 books ("The Seamstress", "Cinder", "Invisible Man", "Fahrenheit 451", "Pride & Prejudice")
        Book[] bookArray = new Book[5];
        bookArray[0] = new Book();
        bookArray[1] = new Book();
        bookArray[2] = new Book();
        bookArray[3] = new Book();
        bookArray[4] = new Book();

        for(int i=0; i < bookArray.length; i++);

//        Book[] allBooks

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
    // Getters and Setters
    public int getBookId() {
        return bookId;
        }
    public void setBookId(int bookId) {
            this.bookId = bookId;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        public Boolean getCheckedOut() {
            return isCheckedOut;
        }

        public void setCheckedOut(Boolean checkedOut) {
            isCheckedOut = checkedOut;
        }

        public String getCheckedOutTo() {
            return checkedOutTo;
        }

        public void setCheckedOutTo(String checkedOutTo) {
            this.checkedOutTo = checkedOutTo;
        }
        // Custom Methods Here

    }
