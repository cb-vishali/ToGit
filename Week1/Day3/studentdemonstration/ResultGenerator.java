
package studentdemonstration;

public class ResultGenerator {

    public static void calculateResult(Student stud) {
        int total;
        float average;
        Subject sub = stud.getSubjects();
        if ("f".equals(stud.getGender())) {
            System.out.println("Name: " + stud.getName() + " Id: " + stud.getId() + " Gender: " + "female");
        } else {
            System.out.println("Name: " + stud.getName() + " Id: " + stud.getId() + " Gender: " + "male");
        }
        total = sub.getmark1() + sub.getmark2() + sub.getmark3();
        average = total / 3;
        System.out.println("Total: " + total + " Average: " + average);
    }
}
