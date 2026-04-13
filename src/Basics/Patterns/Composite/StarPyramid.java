package Basics.Patterns.Composite;

import java.util.Scanner;

public class StarPyramid {

    public static void main(String[] args) {
        
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number of rows:");         
            int n=input.nextInt();
             
            //Method 1
            System.out.println("Method 1:");
            for (int i = 1; i <=n; i++) {

                for (int j = 1; j <=n-i; j++) {  // for space
                    System.out.print(" "+" "); }
           
                for (int j = 1; j <=2*i-1; j+=1) { //for pyramid (Special Traingle 1 loop)

                    System.out.print("* ");
                }
                System.out.println();

              }  
              
              System.out.println();//space between 2 methods
              System.out.println();

              //Method 2
            System.out.println("Method 2:");
            int nstar=1;
            int nspace=n-1;

              for (int i = 1; i <=n; i++) {

                for (int j = 1; j <=nspace; j++) {  // for space
                    System.out.print(" "+" "); }
           
                for (int j = 1; j <=nstar; j+=1) { //for pyramid (Special Traingle 1 loop)

                    System.out.print("* ");
                }
                System.out.println();
                nspace--;
                nstar+=2;

              }
    
    
}

}