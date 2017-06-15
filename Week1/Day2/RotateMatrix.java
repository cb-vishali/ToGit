
package rotatematrix;
import java.util.*;
/**
 *
 * @author cb-vishali
 */
public class RotateMatrix {

    
    public static void main(String[] args) {
    
        int[][] arr=new int[5][5];
    System.out.println("Enter nXn matrix n value:");
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    System.out.println("Enter "+n*n+ " values: ");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
         arr[i][j]=ob.nextInt();
        }
    }
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
         System.out.print(arr[i][j]+" ");
        }
     System.out.println();   
    }
   System.out.println("After Rotation:");
    for(int i=n-1;i>=0;i--)
    {
        for(int j=0;j<n;j++)
        {
         System.out.print(arr[j][i]+" ");
        }
     System.out.println();   
    }
    
    }
    
}
