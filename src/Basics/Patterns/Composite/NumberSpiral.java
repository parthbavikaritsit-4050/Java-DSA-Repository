package Basics.Patterns.Composite;

import java.util.Scanner;

public class NumberSpiral {


     public static void main(String[] args) {
            
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number of rows:");         
            int n=input.nextInt();

            for (int i = 1; i <=2*n-1; i++) {
                for (int j = 1; j <=2*n; j++) {
                    int a=i,b=j;
                    if(i>n)a=2*n-i;
                    if(j>n)b=2*n-j;
            
                    System.out.print((n+1)-(Math.min(a, b))+"  ");//n+1=K+math.min(a,b)     so k=n+1-math.min(a,b) 
                }
                System.out.println();
            }
        }
    
}
