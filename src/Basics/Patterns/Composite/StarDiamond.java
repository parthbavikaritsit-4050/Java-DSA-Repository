package Basics.Patterns.Composite;

import java.util.Scanner;

public class StarDiamond {


    public static void main(String[] args) {
        
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number of rows:");         
            int n=input.nextInt();
             

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

             nstar=nstar-4;// for n=4 it becomes 9 til condition breaks but we want 5 so nstar-4
             nspace=1;

              for (int i = 1; i <=n-1; i++) {


                for (int j = 1; j <=nspace; j++) {  // for space
                    System.out.print(" "+" "); }
           
                for (int j = 1; j <=nstar; j+=1) { //for pyramid (Special Traingle 1 loop)

                    System.out.print("* ");
                }
                System.out.println();
                nspace++;
                nstar-=2;

              }

              
              
  
    
}
}
