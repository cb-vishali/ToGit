
package studentdemonstration;

import java.util.Scanner;

public class Student {

    int id;
    String name, c;
    boolean gender;
    Scanner ob = new Scanner(System.in);

    Subject stud;

    void setId() {
        System.out.println("Enter Id:");
        id = ob.nextInt();
    }

    void setName() {
        System.out.println("Enter name:");
        name = ob.next();
    }

    void setGender() {
        System.out.println("Enter gender (m/f)");
        c = ob.next();
        if ("m".equals(c)) {
            gender = true;
        } else if ("f".equals(c)) {
            gender = false;
        } else {
            System.out.println("Please enter either male(m) or female(f)..");
        }
    }

    void setMarks() {
        stud = new Subject();
        stud.setmark1();
        stud.setmark2();
        stud.setmark3();
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    boolean getGender() {
        return gender;
    }

    Subject getSubjects() {
        return stud;
    }

}
