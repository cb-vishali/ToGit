
package studentdemonstration;

import java.util.Scanner;

public class Subject {

    int mark1, mark2, mark3;
    String sub1, sub2, sub3;
    Scanner ob = new Scanner(System.in);

    void setmark1() {
        System.out.println("Enter 1st subject name and mark");
        sub1 = ob.next();
        mark1 = ob.nextInt();
    }

    void setmark2() {
        System.out.println("Enter 2nd subject name and mark");
        sub2 = ob.next();
        mark2 = ob.nextInt();
    }

    void setmark3() {
        System.out.println("Enter 3rd subject name and mark");
        sub3 = ob.next();
        mark3 = ob.nextInt();
    }

    int getmark1() {
        return mark1;
    }

    int getmark2() {
        return mark2;
    }

    int getmark3() {
        return mark3;
    }

}
