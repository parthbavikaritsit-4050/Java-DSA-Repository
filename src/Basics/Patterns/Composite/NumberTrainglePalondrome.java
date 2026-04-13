package Basics.Patterns.Composite;

import java.util.Scanner;

public class NumberTrainglePalondrome {


    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number of rows:");         
            int n=input.nextInt();
            
            
            for (int i = 1; i <=n; i++) { //for rows
                
            for (int j=1;j<=n-i;j++){ //for space
                System.out.print(" "+" ");
            }    
                
            for (int j = 1; j <=i; j++) {   //for NORMAL number TRAINGLE
                    System.out.print(j+" ");
                }

            for(int j=i-1; j>=1; j--){ //FOR NEXT 4321 321 21 1 OF PALONDROME(Third part)
                System.out.print(j+" ");
            }

            
                System.out.println();
            
        }
    
}
}
