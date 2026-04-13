package Basics.Patterns.Composite;
import java.util.Scanner;

public class StarBridge {

    public static void main(String[] args) {
            
        Scanner input=new Scanner(System.in);
            System.out.print("Enter the number of rows:");         
            int n=input.nextInt();
            int m=n-1;

       
       for(int j=1; j<=2*n-1; j++){ 
       System.out.print("*"+" ");}
       System.out.println();

       for(int i=1;i<=m;i++)
       {

        for(int j=1;j<=m+1-i;j++)//for *
        {       
            System.out.print("*"+" ");
        }

         for(int j=1;j<=2*i-1;j++)//    for space
        {
            System.out.print(" "+" ");
        }

        for(int j=1;j<=m+1-i;j++)//for *    
        {       
            System.out.print("*"+" ");
        }
 
 
    
    
        
System.err.println();
    }

    
}

}