import java.util.Scanner;

public class LibMain 
{

	public static void main(String[] args)
	{
		int nBooks ;
		int bookID = 0;
		String bookName = "";
		String authorName = "";
		int bookQuantity = 0;
		
		Scanner getValue = new Scanner(System.in);
		LibraryManagementSystem lms = new LibraryManagementSystem();
		
		//adding book details
		lms.addBook(new Book(1,"C Programming","Collen Hoover",5));
		lms.addBook(new Book(2,"Principles of Database","Collen Hoover",6));
		lms.addBook(new Book(3,"C++ for beginners","Collen Hoover",3));
		lms.addBook(new Book(4,"Python for all","Collen Hoover",1));
		lms.addBook(new Book(5,"Programming with Java","Chetan Bhaghat",3));
		lms.addBook(new Book(6,"Future of Cloud Computing","Chetan Bhaghat",2));
		lms.addBook(new Book(7,"Revolution 2020","Chetan Bhaghat",4));
		lms.addBook(new Book(8,"Artificial Intelligence - Simplified","Ana Huang   ",6));
		lms.addBook(new Book(9,"Presentation Skills - for everyone","Ana Huang   ",5));
		lms.addBook(new Book(10,"Fundamentals of PL/SQL","Ana Huang   ",3));
		lms.addBook(new Book(11,"Basics of Software Engineering","Ana Huang  ",2));
		
		System.out.println("Book List:");
		lms.viewBooks();
		System.out.println("");
		System.out.println("Select the option below: ");
		System.out.println("1. Get book\t\t2. Return book");
		int option = getValue.nextInt();
		switch (option)
		{
		case 1:
			System.out.println("Enter number of books: ");
			int nbooks = getValue.nextInt();
			do
			{
				System.out.println("Enter Book ID:");
				int getbID = getValue.nextInt();
				Book objBook = lms.searchBookByID(getbID);
				if(objBook != null)
				{
					objBook.setbookQuantity(objBook.getbookQuantity()-1);
					nbooks--;
				}
				else
				{
					System.out.println("Entered book is not available in stock.");
				}
				
			}while(nbooks>0);
			lms.viewBooks();	
			break;

		case 2:
			System.out.println("Enter number of books: ");
			int rbooks = getValue.nextInt();
			do
			{
				System.out.println("Enter Book ID:");
				int getbID = getValue.nextInt();
				Book objBook = lms.searchBookByID(getbID);
				if(objBook != null)
				{
					objBook.setbookQuantity(objBook.getbookQuantity()+1);
					rbooks--;
				}
				else
				{
					System.out.println("Entered book is not issued already.");
				}
				
			}while(rbooks>0);
			lms.viewBooks();	
			break;
		}
		
	}

}
