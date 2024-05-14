import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem 
{
	private List<Book> books = new ArrayList<>();
	
	//to add books
	public void addBook(Book book)
	{
		books.add(book);
	}
	
	//to read or view all the books
	public void viewBooks() 
	{
		books.forEach(System.out::println);
	}
	
	public Book searchBookByID(int bookID)
	{
		for(Book b : books)
		{
			if(b.getbookID()==bookID)
			{
				return b;
			}
		}
		return null;
	}
}
