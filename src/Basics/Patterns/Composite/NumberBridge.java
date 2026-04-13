package Basics.Patterns.Composite;

import java.util.Scanner;

public class NumberBridge {

    public static void main(String[] args) {
            
        Scanner input=new Scanner(System.in);
            System.out.print("Enter the number of rows:");         
            int n=input.nextInt();
            int m=n-1;

       
       for(int j=1; j<=2*n-1; j++){ 
       System.out.print(j+" ");}
       System.out.println();

       for(int i=1;i<=m;i++)
       {
        int a=1;

        for(int j=1;j<=m+1-i;j++)//for frist part
        {       
            System.out.print(a++ +" ");//prints a frist the then increases it
        }

         for(int j=1;j<=2*i-1;j++)//    for space
        {
            System.out.print(" "+" ");
            a++;
        }

        for(int j=1;j<=m+1-i;j++)//for second part
        {       
            System.out.print(a++ +" ");
        }
 
 
    
    
        
System.err.println();
    }

    
}
    
}
