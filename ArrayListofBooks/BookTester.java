import java.util.ArrayList;

public class BookTester
{
    public static void main (String[] args)
    {
        int total = 0;
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Book 1", 350));
        bookList.add(new Book("Book 2", 72));
        bookList.get(1).setNumOfPages(220);
        bookList.get(1).setTitle("Book 3");
        bookList.add(new Book("Book 4", 120));
        bookList.add(new Book("Book 5", 90));
        bookList.add(new Book("Book 6", 120));
        bookList.add(new Book("Book 7", 170));
        bookList.add(new Book("Book 8", 400));

        System.out.println(bookList.get(3).getTitle());
        System.out.println(bookList.size());

        for (int i = 0; i < bookList.size(); i++)
        {
            if(bookList.get(i).getPages() == 120)
            {
                bookList.remove(i);
                i--;
            }
            else 
            {
                total = total + bookList.get(i).getPages();
            }
        }
        System.out.println("Total Pages " + total);

        for (Book book: bookList)
        {
            System.out.println(book);
        }
    }
}