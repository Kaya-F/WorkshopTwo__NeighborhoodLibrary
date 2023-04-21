package com.kf;

import javax.lang.model.element.Name;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userScanner = new Scanner(System.in);

        // Create Array to display the 5 books ("The Seamstress", "Cinder", "Invisible Man", "Fahrenheit 451", "Pride & Prejudice")
        Book[] bookArray = new Book[5];
        bookArray[0] = new Book(301,"270-381978-83-4", "The Seamstress",);
        bookArray[1] = new Book(302, "270-381978-83-5", "Cinder",);
        bookArray[2] = new Book(303,"270-381978-83-6", "Invisible Man",);
        bookArray[3] = new Book(304,"270-381978-83-6", "Fahrenheit 451",);
        bookArray[4] = new Book(305,"270-381978-83-6", "Pride & Prejudice",);

        int totalNumOfBooks = bookArray.length;

        int commandInput;
        do {
            Thread.sleep(2000);
            System.out.println("The Store Home Screen");
            "/t1 - Look Around" +
                    commandInput = Scanner.nextInt();


            //Show Available books
            //ex:
            switch (commandInput){
                case 1:
                    System.out.println("List all available books");
                    System.out.println(bookArray.length);
                    for(int i=0; i < bookArray.length; i++);
                    if(bookArray[5] == null){
                        break;
                    }
                    System.out.println("ID: %d", "ISBN: %d"
                            Book[1].bookId;
                    Book[1].)
            }
                        break;
                 case 2:
                     System.out.println("List all checked out books");
                     break;








//        Book[] allBooks

        } while(commandInput !=3);


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
        checkOut(name)


    }
