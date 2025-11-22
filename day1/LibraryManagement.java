package Assignment;

import Assignment2.Library;

public class LibraryManagement
{
      public static void main(String[] args) 
        {

           Library book = new Library();
            String addedBook = book.addBook("Programming Language");
            System.out.println("Returned Book Title: " + addedBook);
            book.issueBook();
        }
    }


