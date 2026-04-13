package Basics.Patterns;

import java.lang.reflect.Method;
import java.util.Scanner;

public class SpecialTraingle1 {
    
    public static void main(String[] args) {
        
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number of rows:");         
            int n=input.nextInt();
             
            //Method 1
            for (int i = 1; i <=n; i++) {

                for (int j = 1; j <=2*i-1; j+=2) {

                    System.out.print(j+" ");
                }
                System.out.println();

              } 
              
              //Method 2
              System.out.println();//For Space between output of 3 maethods
            
              
              for (int i = 1; i <=n; i++) {
                int a=1;

                for (int j = 1; j <=i; j++) {

                    System.out.print(a+" ");
                    a=a+2;
                
                }
                System.out.println();//For Space between output of 3 maethods
            

              }   
   

           System.out.println();//For Space between output of 3 maethods
              //Method 3

              for (int i = 1; i <=n; i++) {

                for (int j = 1; j <=i; j++) {

                    System.out.print((2*j-1)+" ");
                }
                System.out.println();

              }   
   
    } 

} 

    
