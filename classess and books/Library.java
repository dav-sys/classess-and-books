
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private textbook[]bookShelf;
    private int nextbook;
    private int issuedBorrower = 0;
    private int maxbook;
    private int total= 0;
    
public Library (int maxhold)
{
    nextbook=0;
    maxbook=maxhold;
    bookShelf=null;
    for (int i=0 ;i<maxbook; i++){
        bookShelf[i] = new textbook("textbook" + i,10);
    }
}
public LibraryCard issueCard()
{
    issuedBorrower++;
    return new LibraryCard(10, "cardID" + issuedBorrower);
}
public textbook borrowBook (LibraryCard card)
{
    if (card==null)
    {
        return null;
    }
    else if (card.expired()!=true )
    {
        for (int i=0; i < maxbook;i++)
        {
            if (bookShelf != null)
            {card.swipe ();
                total++;
                return bookShelf[i];
            }
        }
    }
    else
    {
        card.describe();
    }
    return null;
}
public void returnBook(textbook book)
{
    for (int i=0; i<maxbook;i++)
    {
        if(bookShelf [i] == null)
        {
            bookShelf[i] = book;
            total--;
        }
        nextbook++;
    }
}
public void describe ()
{
    System.out.println("the library has" +total+"books left on the shelf and has issued" + this.issuedBorrower + "library cards.");
}}
    
    
        
    
