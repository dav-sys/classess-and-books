
/**
 * Write a description of class LibraryCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryCard
{
    private int Borrow;
    private int BorrowedBooks;
    private String CardID;
public LibraryCard(int  maxBook, String cardIDNUM)
{
    Borrow= maxBook;
    CardID="CardID" + cardIDNUM;
    BorrowedBooks =0;
}
public void swipe()
{
    if (BorrowedBooks < Borrow)
    {
        BorrowedBooks++;
    }}
public boolean expired()
{
    if (BorrowedBooks == Borrow)
    {
        return true;
    }
    else
        return false;
    }

public String getCardRef()
{
    return (CardID);
}
public void describe()
{
    int bookRemain = Borrow - BorrowedBooks;
    System.out.println(CardID + "can borrow" + bookRemain + "books more");
}}


     
   
        
   
    
        


    
    


