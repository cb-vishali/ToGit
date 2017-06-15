
package studentdemonstration;
import java.util.*;

public class StudentDemonstration {

    public static void storeInputData(Student stud) {
        stud.setId();
        stud.setName();
        stud.setGender();
        stud.setMarks();
    }
    
    public static void main(String[] args) {
       Student s=new Student(); 
       StudentDemonstration.storeInputData(s);
       ResultGenerator.calculateResult(s);
       
    }
    
}
