
package employee;
import java.util.*;
class EmployeeDetail
{
    private String name,Gender;
    private int Id;
    private double salary,Tax;
    
    public void setName(String Name)
    {
        name=Name;
    }
    public void setId(int ID)
    {
        Id=ID;
    }
    public void setGender(String gend)
    {
        Gender=gend;
    }
    public void setSalary(Double sal)
    {
        salary=sal;
    }
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return Gender;
    }
    public Double getSalary()
    {
        return salary;
    }
    public int getId()
    {
        return Id;
    }
    
    
    public static double calculateTax(EmployeeDetail Emp)
    {
        if("F".equals(Emp.Gender))
        {
            Emp.Tax=(Emp.getSalary()*(5.0/100));
        }else
        {
            Emp.Tax=Emp.getSalary()*(7.0/100);
        }
        return Emp.Tax;
    }
    
    public void setTax(double tax)
    {
        Tax=tax;
    }
    
    public double getTax()
    {
        return Tax;
    }
    
}

public class Employee {

    
    public static void main(String[] args) {
        
        EmployeeDetail[] emp=new EmployeeDetail[10];
        Scanner sc=new Scanner(System.in);
        String name,gender;int Id;double sal,tax;
        for(int i=0;i<2;i++)
        {
            emp[i]=new EmployeeDetail();
            System.out.println("Enter Employee name,Id,Gender and salary:");
            name=sc.next();Id=sc.nextInt();gender=sc.next();sal=sc.nextDouble();
            emp[i].setName(name);
            emp[i].setId(Id);
            emp[i].setGender(gender);
            emp[i].setSalary(sal);
            tax=EmployeeDetail.calculateTax(emp[i]);
            emp[i].setTax(tax);
        }
        System.out.println("The Employee Details are:");
        for(int i=0;i<2;i++)
        {
            System.out.println("Name: "+emp[i].getName()+" ID: "+emp[i].getId()+" Gender: "+emp[i].getGender()+" Salary: "+emp[i].getSalary()+" Tax to be Paid: "+emp[i].getTax());
        }
    }
    
}




/****

Output
------

debug:
Enter Employee name,Id,Gender and salary:
Vishali
123
F
23000
Enter Employee name,Id,Gender and salary:
Vignes
134
M
25000
The Employee Details are:
Name: Vishali ID: 123 Gender: F Salary: 23000.0 Tax to be Paid: 1150.0
Name: Vignes ID: 134 Gender: M Salary: 25000.0 Tax to be Paid: 1750.0000000000002
BUILD SUCCESSFUL (total time: 16 seconds)

****/
