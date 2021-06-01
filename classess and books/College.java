
import java.util.Random;
import java.util.ArrayList;
public class College
{
    ArrayList<Student> studentList = new ArrayList<Student>();
    private Library Library;
    Random rand = new Random();
    public College  (int maxStudents, int numTextBook)
    {
        Library = new Library (numTextBook);
        for (int i=0; i < maxStudents; i++){
            Student student = new Student ("Student" + i, Library);
            studentList.add(student);
        }
    }
    
    public void describe(){
        int studentNumber= studentList.size();
        System.out.println("This college has" + studentNumber + "students");
        Library.describe();
    }
    
    public void runCollege(int nSteps){
        int number = 0;
        while (number < nSteps){
            number++;
            System.out.println("Step: "+ number);
            describe();
            nextStep();
        }
    }
private void nextStep(){
    if(this.studentList.size() == 0){
        System.out.println("There are no students in this college");
    }
    else{
        Student chosenStudent=studentList.get(rand.nextInt(studentList.size()));
        if (chosenStudent.finishedStudies()){
            studentList.remove(studentList.indexOf(chosenStudent));
            System.out.println("He/ she is currently no longer in this college");
        }
        else{
            System.out.println("He / she is still a member of this college");
        }
    }
}
}


        
        
          
        
    
    
    
    




