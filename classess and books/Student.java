
public class Student
{
    // instance variables
    private String studentName;
    private Library collegesLibrary;
    private LibraryCard card;
    private textbook borrowed;
    
    
    public Student(String name, Library library)
    {
        studentName = name;
        collegesLibrary = library;
        card = collegesLibrary.issueCard();
        borrowed = null;
    }
    public void study (){
        if (borrowed == null){
            collegesLibrary.borrowBook(card);
        }
        else if(borrowed !=null && borrowed.isFinished ()==false){
            borrowed.readNextChapter();
        }
        else if (borrowed != null && borrowed.isFinished() == true){
            borrowed.closeBook();
            collegesLibrary.returnBook(borrowed);
            borrowed= null;
        }
        
    
    
}
     public boolean finishedStudies(){
         if (borrowed == null && this.card.expired()== true){
             return true;
            }
            else{
                return false;
            }
        }
     public void describe (){
         if (borrowed == null){
             System.out.println(this.studentName + " , you do not have a library card");
             card.describe ();
            }
         if (borrowed !=null){
             System.out.println("Student " + studentName + "has borrowed the book");
             borrowed.describe();
             card.describe();
            }
        }
    }
        
        
       
            
            
        
        
