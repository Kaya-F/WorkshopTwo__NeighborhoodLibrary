package com.kf;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws InterruptedException {

            Scanner userScanner = new Scanner(System.in);

            // Create an Array to display the 5 books ("The Seamstress", "Cinder", "Invisible Man", "Fahrenheit 451", "Pride & Prejudice")
            Book[] bookArray = new Book[5];
            bookArray[0] = new Book(301, "173-2172-234", "The Seamstress", false, null);
            bookArray[1] = new Book(302, "194-9364-240", "Cinder", false, null);
            bookArray[2] = new Book(303, "270-3817-883", "Invisible Man", false, null);
            bookArray[3] = new Book(304, "238-1978-837", "Fahrenheit 451", false, null);
            bookArray[4] = new Book(305, "381-7838-463", "Pride & Prejudice", false, null);

//        int library = bookArray.length;

            int commandInput;
            String userInput;

            do {
                Thread.sleep(2000);
                System.out.println(
                        "The Store Home Screen\n" +
                                "\t1 - Show Available Books\n" +
                                "\t2 - Show Checked Out Books\n" +
                                "\tC - Check In a Book\n" +
                                "\t3 - Exit\n" +
                                "Enter your command:"
                );
                commandInput = userScanner.nextInt(); //Show Available books' //ex:
                userScanner.nextLine();
                System.out.println("Enter username for access: ");
                String userName = userScanner.nextLine();

                switch (commandInput) {
                    case 1:
                        //Listing all available books for user to see
                        System.out.println("List of all Available Books: ");
                        for (int i = 0; i < bookArray.length; i++) {
                            if (bookArray[i] == null) {
                                break;
                            }
                            if (!bookArray[i].getCheckedOut()) {
                                System.out.printf("\tID: %d, ISBN: %s, Book Title: %s\n",
                                        bookArray[i].getBookId(),
                                        bookArray[i].getIsbn(),
                                        bookArray[i].getBookTitle()
                                );
                            }
                        }
                        // Book Checkout Process
                        System.out.println("Enter the ID of the book you want to check out: ");
                        int bookId = userScanner.nextInt();
                        for (int i = 0; i < bookArray.length; i++) {
                            if (bookArray[i].getBookId() == bookId) {
                                if (bookArray[i].getCheckedOut()) {

                                    System.out.println("I'm sorry, but this book has already been checked out!");
                                } else {
                                    bookArray[i].setCheckedOut(true);
                                    bookArray[i].setCheckedOutTo(userName);
                                    System.out.println("Book checked out successfully!");
                                }
                                break;
                            }
                        }
                        break;

                    case 2:
                        // Showing all checked out books
                        System.out.println("List of all checked out books: ");
                        boolean noCheckedOutBooks = true;
                        for (int i = 0; i < bookArray.length; i++) {
                            if (bookArray[i] == null) {
                                break;
                            }
                            if (bookArray[i].getCheckedOut()) {
                                System.out.printf("\tID: %d, ISBN: %s, Book Title; %s, Checked out To: %s\n",
                                        bookArray[i].getBookId(),
                                        bookArray[i].getIsbn(),
                                        bookArray[i].getBookTitle(),
                                        bookArray[i].getCheckedOutTo()
                                );
                                noCheckedOutBooks = false;
                            }
                        }
                        if (noCheckedOutBooks) {
                            System.out.println("\tNo books have been checked out at this time.");
                        }
                        System.out.println(" Enter C to check in a book you have previously checked out or X to exit back to the Home Screen.");
                        String bookIdOrX = userScanner.nextLine();
                        if (bookIdOrX.equalsIgnoreCase("X")) {
                            break;
                        }


                    case 'C':
                        // Check in a book
                        System.out.println("Enter the ID of the book you want to check in:");
                        int checkInBookId = userScanner.nextInt();
                        for (int i = 0; i < bookArray.length; i++) {
                            if (bookArray[i].getBookId() == checkInBookId) {
                                if (bookArray[i].getCheckedOut()) {
                                    if (bookArray[i].getCheckedOutTo().equals(userName)) {
                                        bookArray[i].setCheckedOut(false);
                                        bookArray[i].setCheckedOutTo(null);
                                        System.out.println("Book checked in successfully!");
                                    } else {
                                        System.out.println("I'm sorry, but this book was checked out by a different user!");
                                    }
                                } else {
                                    System.out.println("I'm sorry, but this book is not currently checked out!");
                                }
                                break;

                            }
                        }
                        break;
                }

            } while(commandInput !=3);



        }
    }


// Create a Book class
    class Book {
    //Properties of the books
        public int bookId;
        public String isbn;
        public String bookTitle;
        public Boolean isCheckedOut;
        public String checkedOutTo;
        public void checkOut(String userName){
            this.isCheckedOut = true;
            this.checkedOutTo = userName;
        }

    //Constructor(s)
    public Book(int bookId, String isbn, String bookTitle, Boolean isCheckedOut, String checkedOutTo){
        this.bookId = bookId;
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.isCheckedOut = false;
        this.checkedOutTo = null;
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
            return this.isCheckedOut;
        }

        public void setCheckedOut(Boolean checkedOut) {
            this.isCheckedOut = checkedOut;
        }

        public String getCheckedOutTo() {
            return this.checkedOutTo;
        }

        public void setCheckedOutTo(String checkedOutTo) {
            this.checkedOutTo = checkedOutTo;
        }
        // Custom Methods Here
        // checkOut(name)


    }
