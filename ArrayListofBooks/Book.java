public class Book 
{
    private String title;
    private int noOfPages;
    
    public Book()
    {
        this.title = "";
        this.noOfPages = 0;
    }

    public Book (String title, int pages)
    {
        this.title = title;
        this.noOfPages = pages;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getPages()
    {
        return noOfPages;
    }

    public void setNumOfPages(int noOfPages)
    {
        this.noOfPages = noOfPages;
    }

    public String toString()
    {
        return this.title + "-" + this.noOfPages + "pages";
    }
}