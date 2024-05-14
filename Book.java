
public class Book 
{

		private int bookID;
		private String bookName;
		private String authorName;
		private int bookQuantity;
		
		public Book(int bookID, String bookName, String authorName, int bookQuantity)
		{
			this.bookID = bookID;
			this.bookName = bookName;
			this.authorName = authorName;
			this.bookQuantity = bookQuantity;
		}
		
		public int getbookID()
		{
			return bookID;
		}
		public void setbookID(int bookID)
		{
			this.bookID= bookID;
		}
		
		public String getbookName()
		{
			return bookName;
		}
		public void setbookName(String bookName)
		{
			this.bookName = bookName;
		}
		public String getauthorName()
		{
			return authorName;
		}
		public void setauthorName(String authorName)
		{
			this.authorName = authorName;
		}
		public int getbookQuantity()
		{
			return bookQuantity;
		}
		public void setbookQuantity(int bookQuantity)
		{
			this.bookQuantity= bookQuantity;
		}
		
		@Override
		public String toString() {
			return "Book ID: "+bookID+"\tBook Name: "+bookName+"\t\tAuthor Name: "+authorName+"\tQuantity: "+bookQuantity;
		}
}

