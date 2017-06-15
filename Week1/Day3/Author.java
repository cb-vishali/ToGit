
package bookstore;

/**
 *
 * @author cb-vishali
 */
public class Author {
    
    
    private String name,email;
    private char gender;
    
    Author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public char getGender()
    {
        return gender;
    }
    public String toDisplay()
    {
        return (name+"("+gender+") at "+email);
    }
    public static void main(String args[])
    {
         Author auth=new Author("Vishali","riodinto@gmail.com",'F');
         System.out.println(auth.toDisplay());
         auth.setEmail("vishalikk@gmail.com");
         System.out.println(auth.toDisplay());
    }
}

    

