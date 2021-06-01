

public class textbook
{
      
    private int chapters;
    private String title;
    private int LastChapter;
    public textbook(String bookTitle, int length ){
    title = bookTitle;
    LastChapter=0;
    chapters=length;
   }
   public String getTitle()
   {
       //return bookTitle;
       return title;
    }
    
    public void readNextChapter(){
        if (LastChapter<chapters){
            LastChapter++;
            
       }
        else{System.out.println ("Last chapter, no more chapters to be read"); 
                
        }
           
      
    
    }
    public boolean isFinished(){
       if (chapters==LastChapter){
            return true;}
       else{
        return false;
       
     
    }}
    public void closeBook(){
        LastChapter=0;
    }
    public void describe(){
        int ChaptersLeft=chapters - LastChapter;
        System.out.println(title+ " with " + ChaptersLeft+"chapters left");
}}



    

