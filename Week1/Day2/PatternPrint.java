
package patternprint;

import java.util.*;
/**
 *
 * @author cb-vishali
 */
public class PatternPrint {

    
    public static void main(String[] args) {
        
        System.out.println("Enter no.of.rows:");
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        
       for(int i=1;i<=n+1;i++)
       {
           for(int k=i;k<=n+1;k++)
            System.out.print(" ");
        for(int j=1;j<i;j++)
        {
         System.out.print(j);   
        }
        for(int j=i-2;j>0;j--)
        {
         System.out.print(j);   
        }
        System.out.println();
       } 
    }
    
}
